package multiplatform.dto

import kotlinx.serialization.Serializable
import multiplatform.dto.enums.Lease
import multiplatform.dto.enums.PropertyType

@Serializable
data class Property(
    val id: String,
    var propertyType: PropertyType,
    var price: Money,
    var address: Address,
    var countOfRooms: Int,
    var countOfBaths: Int,
    var square: Double,
    var furnished: Boolean,
    // Срок аренды
    var lease: Lease,

    ){

}