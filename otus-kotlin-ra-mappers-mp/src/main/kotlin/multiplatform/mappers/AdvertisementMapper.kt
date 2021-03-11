package multiplatform.mappers

import model.Advertisement
import java.time.LocalDateTime

class AdvertisementMapper {
    companion object {
        val INSTANCE: AdvertisementMapper = AdvertisementMapper()
    }

    fun toMultiplfatform(advertisementBackModel: Advertisement): multiplatform.dto.Advertisement {
        val adOwner = UserMapper.INSTANCE.toMultiplfatform(advertisementBackModel.adOwner)
        val property = PropertyMapper.INSTANCE.toMultiplfatform(advertisementBackModel.property)

        with(advertisementBackModel) {
            return multiplatform.dto.Advertisement(id = id,
                adOwner = adOwner,
                active = active,
                dateFrom = dateFrom.toString(),
                dateTill = dateTill.toString(),
                property = property
            )
        }
    }


    fun toBack(advertisementMpModel: multiplatform.dto.Advertisement): Advertisement {
        val adOwner = UserMapper.INSTANCE.toBack(advertisementMpModel.adOwner)
        val property = PropertyMapper.INSTANCE.toBack(advertisementMpModel.property)

        with(advertisementMpModel) {
            return Advertisement(id = id, adOwner = adOwner, active = active, dateFrom = LocalDateTime.parse(dateFrom),
                dateTill = LocalDateTime.parse(dateTill), property = property
            )
        }
    }
}