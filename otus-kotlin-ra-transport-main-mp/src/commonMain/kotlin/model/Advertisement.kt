package model

import kotlinx.serialization.Serializable
//import java.time.LocalDateTime

@Serializable
data class Advertisement(
    val id: IdModel,
    val adOwner: User,
    var property: Property,
    val dateFrom: String,
    var dateTill: String,
    val isActive: Boolean
)

