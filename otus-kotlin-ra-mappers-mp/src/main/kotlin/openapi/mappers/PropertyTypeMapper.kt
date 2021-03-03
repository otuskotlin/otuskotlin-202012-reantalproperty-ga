package openapi.mappers

import model.enums.PropertyType
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy
import org.mapstruct.factory.Mappers

@Mapper(unmappedSourcePolicy = ReportingPolicy.ERROR)
open class PropertyTypeMapper {
    companion object {
        val INSTANCE: PropertyTypeMapper = Mappers.getMapper(PropertyTypeMapper::class.java)
    }

    fun toOpenApi(propertyTypeBackModel: PropertyType): org.example.transport.openapi.models.Property.PropertyType {
        return when (propertyTypeBackModel) {
            PropertyType.FLAT -> org.example.transport.openapi.models.Property.PropertyType.flat
            PropertyType.HOUSE -> org.example.transport.openapi.models.Property.PropertyType.house
            PropertyType.ROOM -> org.example.transport.openapi.models.Property.PropertyType.room
            else -> throw RuntimeException("No match for this propertyType - $propertyTypeBackModel")
        }

    }


    fun toBack(propertyTypeOpenapiModel: org.example.transport.openapi.models.Property.PropertyType): PropertyType {
        return when (propertyTypeOpenapiModel) {
            org.example.transport.openapi.models.Property.PropertyType.flat -> PropertyType.FLAT
            org.example.transport.openapi.models.Property.PropertyType.house -> PropertyType.HOUSE
            org.example.transport.openapi.models.Property.PropertyType.room -> PropertyType.ROOM
        }

    }
}