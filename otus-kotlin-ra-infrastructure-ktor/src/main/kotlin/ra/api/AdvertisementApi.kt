package ra.api

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import multiplatform.dto.Advertisement
import ra.service.AdvertisementService

fun Routing.advertisementApi() {
    val advertisementService = AdvertisementService()
    route("/api/advertisement/get") {
        post() {
            call.respond(HttpStatusCode.OK,advertisementService.get(null))
        }
        post("/{id}") {
            val id = call.parameters["id"]
            try {
                call.respond(HttpStatusCode.OK,advertisementService.getOne(id!!))
            } catch (e: Throwable) {
                call.respond(HttpStatusCode.NotFound)
            }
        }

        post("/create"){
            val advertisement = call.receive<Advertisement>()
            try {
                advertisementService.create(advertisement)
                call.respond(HttpStatusCode.Created)
            } catch (e: Throwable) {
                call.respond(HttpStatusCode.InternalServerError)
            }
        }
        //Пока заглушка до того как не прикрутим БД
        post("/update/{id}"){
            val id = call.parameters["id"]
            val advertisement = call.receive<Advertisement>()
            call.respond(HttpStatusCode.OK)
        }
        post("/delete/{id}"){
            val id = call.parameters["id"]
            val advertisement = call.receive<Advertisement>()
            call.respond(HttpStatusCode.OK)
        }
    }
}