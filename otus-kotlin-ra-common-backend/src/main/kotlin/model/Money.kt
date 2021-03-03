package model

import java.math.BigDecimal
import java.math.BigInteger


/**
 * Деньги
 */

data class Money(
    /** Сумма */
    var amount: BigDecimal? = null,
    /** Код валюты, 3-х символьный */
    var currencyCode: String? = null
)
