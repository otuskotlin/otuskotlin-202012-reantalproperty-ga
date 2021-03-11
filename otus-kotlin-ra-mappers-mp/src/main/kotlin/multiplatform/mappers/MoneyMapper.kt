package multiplatform.mappers

import model.Money
import java.math.BigDecimal


class MoneyMapper {
    companion object {
        val INSTANCE: MoneyMapper = MoneyMapper()
    }

    fun toMultiplfatform(moneyBackModel: Money): multiplatform.dto.Money {
        val amount = moneyBackModel.amount.toString()
        val currencyCode = moneyBackModel.currencyCode
        return multiplatform.dto.Money(amount = amount, currencyCode = currencyCode)
    }


    fun toBack(moneyMpModel: multiplatform.dto.Money): Money {
        val amount = BigDecimal(moneyMpModel.amount)
        val currencyCode = moneyMpModel.currencyCode
        return Money(amount, currencyCode)
    }
}