package multiplatform.dto

import kotlinx.serialization.Serializable

@Serializable
data class Address(
    // Регион местонахождения объекта недвижимости
    val county: String?,
    val distinct: String?,
    val city: String?,
    val street: String?,
    val buildNumber: String?,
)

