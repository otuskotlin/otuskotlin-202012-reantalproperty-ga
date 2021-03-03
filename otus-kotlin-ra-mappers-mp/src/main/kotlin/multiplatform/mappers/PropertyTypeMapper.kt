package multiplatform.mappers

import model.enums.PropertyType
import org.mapstruct.Mapper
import org.mapstruct.NullValueCheckStrategy
import org.mapstruct.ReportingPolicy
import org.mapstruct.factory.Mappers

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
interface PropertyTypeMapper {
    companion object {
        val INSTANCE: PropertyTypeMapper = Mappers.getMapper(PropertyTypeMapper::class.java)
    }

    fun toMultiplfatform(propertyTypeBackModel: PropertyType): multiplatform.dto.enums.PropertyType


    fun toBack(propertyTypeMpModel: multiplatform.dto.enums.PropertyType): PropertyType
}