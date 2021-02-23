package model

import java.time.LocalDateTime

data class Advertisement(
    val id: IdModel,
    val adOwner: User,
    var property: Property,
    val dateFrom: LocalDateTime,
    var dateTill: LocalDateTime,
)

