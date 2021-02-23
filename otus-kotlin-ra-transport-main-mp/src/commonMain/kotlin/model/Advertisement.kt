package model

import kotlinx.serialization.Serializable
//import java.time.LocalDateTime

@Serializable
data class Advertisement(
    val id: IdModel,
    val adOwner: User,
    var property: Property,
//    val dateFrom: Time,
//    var dateTill: LocalDateTime,
)

