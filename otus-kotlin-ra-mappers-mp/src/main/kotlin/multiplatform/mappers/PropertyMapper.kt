package multiplatform.mappers

import model.Property
import org.mapstruct.Mapper
import org.mapstruct.NullValueCheckStrategy
import org.mapstruct.ReportingPolicy
import org.mapstruct.factory.Mappers

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
interface PropertyMapper {
    companion object {
        val INSTANCE: PropertyMapper
                = Mappers.getMapper(PropertyMapper::class.java)
    }
    fun toMultiplfatform(propertyBackModel: Property): multiplatform.dto.Property


    fun toBack(propertyMpModel: multiplatform.dto.Property): Property
}