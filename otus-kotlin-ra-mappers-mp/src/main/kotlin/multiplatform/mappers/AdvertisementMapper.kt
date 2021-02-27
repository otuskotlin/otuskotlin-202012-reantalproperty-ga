package multiplatform.mappers

import model.Advertisement
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.NullValueCheckStrategy
import org.mapstruct.ReportingPolicy
import org.mapstruct.factory.Mappers

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
interface AdvertisementMapper {
    companion object {
        val INSTANCE: AdvertisementMapper
                = Mappers.getMapper(AdvertisementMapper::class.java)
    }
    fun toMultiplfatform(advertisementBackModel: Advertisement): multiplatform.dto.Advertisement


    fun toBack(advertisementMpModel: multiplatform.dto.Advertisement): Advertisement
}