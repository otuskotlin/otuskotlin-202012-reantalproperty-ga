package ra

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.serialization.*
import jsonConfig
import kotlinx.serialization.json.Json
import multiplatform.dto.Money
import ra.api.advertisementApi

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)


val money = Money("12.0", "RUB")

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {

    install(Routing) {
        advertisementApi()
    }
    install(StatusPages) {
        this.exception<Throwable> { e ->
            call.respondText(e.localizedMessage, ContentType.Text.Plain)
            throw(e)
        }
    }

    install(ContentNegotiation) {
        json(
            contentType = ContentType.Application.Json,
            json = jsonConfig
        )
    }
}