package multiplatform.mappers

import model.enums.PropertyType


class PropertyTypeMapper {
    companion object {
        val INSTANCE: PropertyTypeMapper = PropertyTypeMapper()
    }

    fun toMultiplfatform(propertyTypeBackModel: PropertyType): multiplatform.dto.enums.PropertyType {
        return when (propertyTypeBackModel) {
            PropertyType.FLAT -> multiplatform.dto.enums.PropertyType.FLAT
            PropertyType.HOUSE -> multiplatform.dto.enums.PropertyType.HOUSE
            PropertyType.ROOM -> multiplatform.dto.enums.PropertyType.ROOM
            else -> throw RuntimeException("No match for this propertyType - $propertyTypeBackModel")
        }
    }


    fun toBack(propertyTypeMpModel: multiplatform.dto.enums.PropertyType): PropertyType {
        return when (propertyTypeMpModel) {
            multiplatform.dto.enums.PropertyType.FLAT -> PropertyType.FLAT
            multiplatform.dto.enums.PropertyType.HOUSE -> PropertyType.HOUSE
            multiplatform.dto.enums.PropertyType.ROOM -> PropertyType.ROOM
            else -> throw RuntimeException("No match for this propertyType - $propertyTypeMpModel")
        }
    }
}