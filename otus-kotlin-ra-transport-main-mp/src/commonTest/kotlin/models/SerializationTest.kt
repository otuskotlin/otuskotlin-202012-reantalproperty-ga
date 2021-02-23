package models

import kotlinx.serialization.json.Json
import model.Address
import model.Money
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

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
        assertTrue { moneyStr.contains("2.0") }
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
        assertTrue { addressStr.contains("Dublin city") }
        assertTrue { addressStr.contains("Corduff") }
        val dto = json.decodeFromString(Address.serializer(), addressStr)
        assertEquals("Dublin county", dto.county)
        assertNotEquals("Cork", dto.city)

    }
}
