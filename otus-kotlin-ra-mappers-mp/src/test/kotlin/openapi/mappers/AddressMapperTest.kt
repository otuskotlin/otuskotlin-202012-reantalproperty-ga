package openapi.mappers

import multiplatform.dto.Money
import multiplatform.mappers.MoneyMapper
import org.example.transport.openapi.models.Address
import org.junit.Test
import kotlin.test.assertEquals

class AddressMapperTest {
    @Test
    fun toBackMappingTest() {
        val addressMapper =  AddressMapper.INSTANCE
        val address = Address("Dublin", "Cork")
        val addressBackModel = addressMapper.toBack(address)
        assertEquals(addressBackModel.county, address.county)
        assertEquals(addressBackModel.distinct, address.distinct)
    }

    @Test
    fun toOpenapiMappingTest() {
        val addressMapper =  AddressMapper.INSTANCE
        val addressBackModel = model.Address("Dublin", "Cork", null,null,null)
        val address = addressMapper.toOpenApi(addressBackModel)
        assertEquals(address.county, addressBackModel.county)
        assertEquals(address.distinct, addressBackModel.distinct)
    }
}