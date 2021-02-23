package model


/**
 * Деньги
 */

data class Money(
    /** Сумма */
    var amount: Double? = null,
    /** Код валюты, 3-х символьный */
    var currencyCode: String? = null
)
