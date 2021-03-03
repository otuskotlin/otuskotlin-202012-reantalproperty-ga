import com.google.gson.Gson
import org.example.transport.openapi.models.Address
import org.example.transport.openapi.models.Money
import java.math.BigDecimal
import kotlin.test.*

internal class SerializationTest {
    @Test
    fun moneySerialTest() {
        val gson = Gson()
        val money = Money(currencyCode = "RUB", amount = BigDecimal(2.0))
        val json = gson.toJson(money)
        assertTrue { json.contains("RUB") }
        assertTrue { json.contains("2") }
        val dto = gson.fromJson(json, Money::class.java)
        assertEquals("RUB", dto.currencyCode)
        assertNotEquals(3.0, dto.amount)

    }


    @Test
    fun AddressSerialTest() {
        val gson = Gson()
        val address = Address(county = "Dublin county",  city= "Corduff",
            distinct = null, buildNumber = null,street = null)
        val json = gson.toJson(address)
        assertTrue { json.contains("Dublin county") }
        assertTrue { json.contains("Corduff") }
        val dto = gson.fromJson(json, Address::class.java)
        assertEquals("Dublin county", dto.county)
        assertNotEquals("Cork", dto.city)
        assertNull(dto.street)
        assertNull(dto.buildNumber)
        assertNull(dto.distinct)
    }
}
