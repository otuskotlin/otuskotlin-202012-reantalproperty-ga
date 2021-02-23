package model

import kotlinx.serialization.Serializable
import model.enums.Lease
import model.enums.PropertyType

@Serializable
data class Property(
    val idModel: IdModel,
    var propertyType: PropertyType,
    var price: Money,
    var address: Address,
    var countOfRooms: Int,
    var countofBaths: Int,
    var square: Double,
    var isFurnished: Boolean,
    // Срок аренды
    var lease: Lease,

    ){

}