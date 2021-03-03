package openapi.mappers

import model.Advertisement
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy
import org.mapstruct.factory.Mappers
import java.time.OffsetDateTime

@Mapper(unmappedSourcePolicy = ReportingPolicy.ERROR)
open class AdvertisementMapper {

    companion object {
        val INSTANCE: AdvertisementMapper = Mappers.getMapper(AdvertisementMapper::class.java)
    }


    fun toBack(advertisementMpModel: org.example.transport.openapi.models.Advertisement): Advertisement {
        val adOwner = UserMapper.INSTANCE.toBack(advertisementMpModel.adOwner)
        val property = PropertyMapper.INSTANCE.toBack(advertisementMpModel.property)

        with(advertisementMpModel) {
            return Advertisement(id = id, adOwner = adOwner, active = active, dateFrom = dateFrom.toLocalDateTime(),
                dateTill = dateTill.toLocalDateTime(), property = property
            )
        }
    }

    fun toOpenApi(advertisementBackModel: Advertisement): org.example.transport.openapi.models.Advertisement {
        with(advertisementBackModel) {

            return org.example.transport.openapi.models.Advertisement(
                id = id,
                adOwner = UserMapper.INSTANCE.toOpenApi(adOwner),
                property = PropertyMapper.INSTANCE.toOpenApi(property),
                dateFrom = dateFrom.atOffset(OffsetDateTime.now().getOffset()),
                dateTill = dateTill.atOffset(OffsetDateTime.now().getOffset()),
                active = active)
        }
    }

}