package multiplatform.mappers

import model.Address


class AddressMapper {
    companion object {
        val INSTANCE: AddressMapper = AddressMapper()
    }

    fun toMultiplfatform(addressBackModel: Address): multiplatform.dto.Address {
        with(addressBackModel) {
            val multiplatformAddress = multiplatform.dto.Address(
                county = county,
                street = street,
                buildNumber = buildNumber,
                distinct = distinct,
                city = city
            )
            return multiplatformAddress
        }
    }


    fun toBack(adressMpModel: multiplatform.dto.Address): Address {
        with(adressMpModel) {
            return Address(county = county, buildNumber = buildNumber, city = city, street = street,
                distinct = distinct
            )
        }
    }
}
