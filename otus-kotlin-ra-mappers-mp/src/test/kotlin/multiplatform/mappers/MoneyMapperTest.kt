package multiplatform.mappers

import multiplatform.dto.Money
import kotlin.test.Test
import kotlin.test.assertEquals

class MoneyMapperTest {
    @Test
    fun toBackMappingTest() {
        val money = Money(23.5, "RUB")
        val backMoneyModel = MoneyMapper.INSTANCE.toBack(money)
        assertEquals(backMoneyModel.amount, money.amount)
        assertEquals(backMoneyModel.currencyCode, money.currencyCode)
    }

    @Test
    fun toMultiplatformMappingTest() {
        val backMoneyModel = model.Money(23.5, "RUB")
        val mpMoney = MoneyMapper.INSTANCE.toMultiplfatform(backMoneyModel)
        assertEquals(mpMoney.amount, backMoneyModel.amount)
        assertEquals(mpMoney.currencyCode, backMoneyModel.currencyCode)
    }


}