package model.enums

import kotlinx.serialization.Serializable

// Срок аренды
@Serializable
enum class Lease {
    HOUR, DAY, WEEK, MONTH, HALF_OF_YEAR, ONE_YEAR_AND_MORE

}
