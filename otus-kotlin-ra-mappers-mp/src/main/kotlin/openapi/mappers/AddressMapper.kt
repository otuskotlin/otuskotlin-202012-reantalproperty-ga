package openapi.mappers

import model.Address

class AddressMapper {

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
        val countyBack = adressMpModel.county
        val buildNumberBack = adressMpModel.buildNumber
        val cityBack = adressMpModel.city
        val streetBack = adressMpModel.street
        val distinctBack = adressMpModel.distinct

        val address = Address(county = countyBack, buildNumber = buildNumberBack, city = cityBack, street = streetBack,
            distinct = distinctBack
        )
        return address
    }
}
