package multiplatform.mappers

import org.mapstruct.*
import org.mapstruct.factory.Mappers
import model.Money
import java.math.BigDecimal

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
interface MoneyMapper {
    companion object {
        val INSTANCE: MoneyMapper
                = Mappers.getMapper(MoneyMapper::class.java)
    }

    fun toMultiplfatform(moneyBackModel: Money): multiplatform.dto.Money {
        val amount = moneyBackModel.amount.toString()
        val currencyCode = moneyBackModel.currencyCode
        return multiplatform.dto.Money(amount = amount, currencyCode=currencyCode)
    }



    fun toBack(moneyMpModel: multiplatform.dto.Money): Money{
        val amount = BigDecimal(moneyMpModel.amount)
        val currencyCode = moneyMpModel.currencyCode
        return Money(amount,currencyCode)
    }
}