package openapi.mappers

import model.Money
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy
import org.mapstruct.factory.Mappers

@Mapper(unmappedSourcePolicy = ReportingPolicy.ERROR)
open class MoneyMapper {

    companion object {
        val INSTANCE:  MoneyMapper= Mappers.getMapper(MoneyMapper::class.java)
    }

    fun toOpenApi(moneyBackModel: Money): org.example.transport.openapi.models.Money {
        return org.example.transport.openapi.models.Money(moneyBackModel.amount, moneyBackModel.currencyCode)
    }

    fun toBack(moneyMpModel: org.example.transport.openapi.models.Money): Money {
        return Money(moneyMpModel.amount, moneyMpModel.currencyCode)
    }
}