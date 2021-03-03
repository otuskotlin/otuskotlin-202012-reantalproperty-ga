package openapi.mappers

import model.Property
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy
import org.mapstruct.factory.Mappers

@Mapper(unmappedSourcePolicy = ReportingPolicy.ERROR)
open class PropertyMapper {

    companion object {
        val INSTANCE: PropertyMapper = Mappers.getMapper(PropertyMapper::class.java)
    }

    fun toOpenApi(userBackModel: Property): org.example.transport.openapi.models.Property {
        with(userBackModel) {

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

    fun toBack(userMpModel: org.example.transport.openapi.models.Property): Property {
        with(userMpModel) {

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