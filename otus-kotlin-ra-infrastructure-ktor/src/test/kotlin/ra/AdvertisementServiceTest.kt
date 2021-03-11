package ra

import io.ktor.http.*
import io.ktor.server.testing.*
import jsonConfig
import kotlinx.serialization.decodeFromString
import multiplatform.dto.Advertisement
import org.junit.Assert.fail
import org.junit.Test
import ra.service.AdvertisementService
import kotlin.test.assertEquals

class AdvertisementServiceTest {

    @Test
    fun testGetAll() {
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Post, "/api/advertisement/get") {
                addHeader("Content-Type", "application/json")
            }.apply {
                assertEquals(HttpStatusCode.OK, response.status())
                val jsonString = response.content ?: fail("Null response json")
                val jsonStringForResponse = jsonString.toString()
                val res = jsonConfig.decodeFromString(jsonStringForResponse) as List<Advertisement>
                assertEquals("Ivan", res[0].adOwner.firstName)
                assertEquals("Leningrad Region", res[1].property.address.distinct)
            }
        }
    }


    @Test
    fun testGetOne() {
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Post, "/api/advertisement/get/0") {
                addHeader("Content-Type", "application/json")
            }.apply {
                assertEquals(HttpStatusCode.OK, response.status())
                val jsonString = response.content ?: fail("Null response json")
                val jsonStringForResponse = jsonString.toString()
                val res = jsonConfig.decodeFromString(jsonStringForResponse) as Advertisement
                assertEquals("Michail", res.adOwner.firstName)
            }
        }
    }
}


