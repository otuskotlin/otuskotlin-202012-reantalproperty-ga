package ra

import io.ktor.http.*
import io.ktor.server.testing.*
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest {
    @Test
    fun testRoot() {
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Post, "/api/advertisement/get").apply {
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }
}