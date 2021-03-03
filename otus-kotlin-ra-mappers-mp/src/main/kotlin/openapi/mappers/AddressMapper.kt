package openapi.mappers

import model.Address
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy
import org.mapstruct.factory.Mappers
@Mapper(unmappedSourcePolicy = ReportingPolicy.ERROR)
open class AddressMapper {
    companion object {
        val INSTANCE: AddressMapper = Mappers.getMapper(AddressMapper::class.java)
    }

    fun toOpenApi(addressBackModel: Address): org.example.transport.openapi.models.Address {
        with(addressBackModel) {
            val openApiAddress = org.example.transport.openapi.models.Address(
                county = county,
                street = street,
                buildNumber = buildNumber,
                distinct = distinct,
                city = city
            )
            return openApiAddress
        }

    }


    fun toBack(adressMpModel: org.example.transport.openapi.models.Address): Address {
        with(adressMpModel) {
            return Address(county = county, buildNumber = buildNumber, city = city, street = street,
                distinct = distinct
            )
        }
    }
}
