package multiplatform.dto

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: String,
    var firstName: String?,
    var secondName: String?,
)
