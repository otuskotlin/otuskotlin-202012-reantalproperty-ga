package multiplatform.mappers

import model.Property

class PropertyMapper {
    companion object {
        val INSTANCE: PropertyMapper = PropertyMapper()
    }

    fun toMultiplfatform(propertyBackModel: Property): multiplatform.dto.Property {
        with(propertyBackModel) {

            return multiplatform.dto.Property(
                address = AddressMapper.INSTANCE.toMultiplfatform(address),
                id = id,
                countOfBaths = countofBaths,
                countOfRooms = countOfRooms,
                propertyType = PropertyTypeMapper.INSTANCE.toMultiplfatform(propertyType),
                price = MoneyMapper.INSTANCE.toMultiplfatform(price),
                furnished = furnished,
                lease = LeaseTypeMapper.INSTANCE.toMultiplfatform(lease),
                square = square)
        }
    }


    fun toBack(propertyMpModel: multiplatform.dto.Property): Property {
        with(propertyMpModel) {

            return Property(address = AddressMapper.INSTANCE.toBack(address),
                id = id,
                countofBaths = countOfBaths,
                countOfRooms = countOfRooms,
                propertyType = PropertyTypeMapper.INSTANCE.toBack(propertyType),
                price = MoneyMapper.INSTANCE.toBack(price),
                furnished = furnished,
                lease = LeaseTypeMapper.INSTANCE.toBack(lease),
                square = square)

        }
    }
}