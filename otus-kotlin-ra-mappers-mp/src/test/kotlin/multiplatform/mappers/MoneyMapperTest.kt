package multiplatform.mappers

import multiplatform.dto.Money
import java.math.BigDecimal
import kotlin.test.Test
import kotlin.test.assertEquals

class MoneyMapperTest {
    @Test
    fun toBackMappingTest() {
        val money = Money("23.5", "RUB")
        val backMoneyModel = MoneyMapper.INSTANCE.toBack(money)
        assertEquals(backMoneyModel.amount.toString(), money.amount)
        assertEquals(backMoneyModel.currencyCode, money.currencyCode)
    }

    @Test
    fun toMultiplatformMappingTest() {
        val backMoneyModel = model.Money(BigDecimal(23.5), "RUB")
        val mpMoney = MoneyMapper.INSTANCE.toMultiplfatform(backMoneyModel)
        assertEquals(mpMoney.amount, backMoneyModel.amount.toString())
        assertEquals(mpMoney.currencyCode, backMoneyModel.currencyCode)
    }


}