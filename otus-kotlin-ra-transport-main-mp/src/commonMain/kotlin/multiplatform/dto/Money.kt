package multiplatform.dto

import kotlinx.serialization.Serializable

/**
 * Деньги
 */
@Serializable
data class Money(
    /** Сумма */
    var amount: String? = null,
    /** Код валюты, 3-х символьный */
    var currencyCode: String? = null
)
