package model

import java.time.LocalDateTime

data class Advertisement(
    val id: IdModel,
    val adOuwner: User,
    var property: Property,
    val dateFrom: LocalDateTime,
    var dateTill: LocalDateTime,
)

