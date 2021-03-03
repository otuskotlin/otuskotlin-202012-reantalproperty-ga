package model

import java.time.LocalDateTime

data class Advertisement(
    val id: String,
    val adOwner: User,
    var property: Property,
    val dateFrom: LocalDateTime,
    var dateTill: LocalDateTime,
    var active: Boolean
)

