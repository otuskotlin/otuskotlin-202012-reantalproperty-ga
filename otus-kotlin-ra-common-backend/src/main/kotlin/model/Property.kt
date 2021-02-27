package model

import model.enums.Lease
import model.enums.PropertyType


data class Property(
    val idModel: String,
    var propertyType: PropertyType,
    var price: Money,
    var address: Address,
    var countOfRooms: Int,
    var countofBaths: Int,
    var square: Double,
    var furnished: Boolean,
    // Срок аренды
    var lease: Lease

)