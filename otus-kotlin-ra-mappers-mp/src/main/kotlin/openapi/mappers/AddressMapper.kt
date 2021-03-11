package openapi.mappers

import model.Address

open class AddressMapper {
    companion object {
        val INSTANCE: AddressMapper = AddressMapper()
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
