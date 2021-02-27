package multiplatform.mappers

import org.mapstruct.*
import org.mapstruct.factory.Mappers
import model.Money

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
interface MoneyMapper {
    companion object {
        val INSTANCE: MoneyMapper
                = Mappers.getMapper(MoneyMapper::class.java)
    }
    fun toMultiplfatform(moneyBackModel: Money): multiplatform.dto.Money


    fun toBack(moneyMpModel: multiplatform.dto.Money): Money
}