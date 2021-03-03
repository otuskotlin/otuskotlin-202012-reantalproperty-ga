package multiplatform.dto

import kotlinx.serialization.Serializable

@Serializable
data class Advertisement(
    val id: String,
    val adOwner: User,
    var property: Property,
    val dateFrom: String,
    var dateTill: String,
    val active: Boolean
)

