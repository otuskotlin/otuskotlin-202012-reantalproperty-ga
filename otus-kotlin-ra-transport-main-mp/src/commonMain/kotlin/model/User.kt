package model

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: IdModel,
    var login: String,
    var fName: String?,
    var sName: String?,
)
