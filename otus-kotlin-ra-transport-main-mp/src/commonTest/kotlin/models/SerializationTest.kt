package models

import kotlinx.serialization.json.Json
import multiplatform.dto.Address
import multiplatform.dto.Money
import kotlin.test.*

internal class SerializationTest {
    @Test
    fun moneySerialTest() {
        val money = Money(currencyCode = "RUB", amount = 2.0)
        val json = Json {
            prettyPrint = true
        }
        val moneyStr = json.encodeToString(Money.serializer(), money)
        println(moneyStr)
        assertTrue { moneyStr.contains("RUB") }
        assertTrue { moneyStr.contains("2") }
        val dto = json.decodeFromString(Money.serializer(), moneyStr)
        assertEquals("RUB", dto.currencyCode)
        assertNotEquals(3.0, dto.amount)

    }


    @Test
    fun AddressSerialTest() {
        val address = Address(county = "Dublin county",  city= "Corduff",
            distinct = null, buildNumber = null,street = null)
        val json = Json {
            prettyPrint = true
        }
        val addressStr = json.encodeToString(Address.serializer(), address)
        println(addressStr)
        assertTrue { addressStr.contains("Dublin county") }
        assertTrue { addressStr.contains("Corduff") }
        val dto = json.decodeFromString(Address.serializer(), addressStr)
        assertEquals("Dublin county", dto.county)
        assertNotEquals("Cork", dto.city)
        assertNull(dto.street)
        assertNull(dto.buildNumber)
        assertNull(dto.distinct)
    }
}
