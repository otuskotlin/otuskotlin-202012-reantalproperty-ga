package openapi.mappers

import model.Property

open class PropertyMapper {

    companion object {
        val INSTANCE: PropertyMapper = PropertyMapper()
    }

    fun toOpenApi(propertyBackModel: Property): org.example.transport.openapi.models.Property {
        with(propertyBackModel) {

            return org.example.transport.openapi.models.Property(
                address = AddressMapper.INSTANCE.toOpenApi(address),
                id = id,
                countOfBaths = countofBaths,
                countOfRooms = countOfRooms,
                propertyType = PropertyTypeMapper.INSTANCE.toOpenApi(propertyType),
                price = MoneyMapper.INSTANCE.toOpenApi(price),
                furnished = furnished,
                lease = LeaseMapper.INSTANCE.toOpenApi(lease),
                square = square)
        }
    }

    fun toBack(propertyMpModel: org.example.transport.openapi.models.Property): Property {
        with(propertyMpModel) {

            return Property(address = AddressMapper.INSTANCE.toBack(address),
                id = id,
                countofBaths = countOfBaths,
                countOfRooms = countOfRooms,
                propertyType = PropertyTypeMapper.INSTANCE.toBack(propertyType),
                price = MoneyMapper.INSTANCE.toBack(price),
                furnished = furnished,
                lease = LeaseMapper.INSTANCE.toBack(lease),
                square = square)

        }
    }
}