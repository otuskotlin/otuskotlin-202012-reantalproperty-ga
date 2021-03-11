package openapi.mappers

import model.Money

open class MoneyMapper {

    companion object {
        val INSTANCE: MoneyMapper = MoneyMapper()
    }

    fun toOpenApi(moneyBackModel: Money): org.example.transport.openapi.models.Money {
        return org.example.transport.openapi.models.Money(moneyBackModel.amount, moneyBackModel.currencyCode)
    }

    fun toBack(moneyMpModel: org.example.transport.openapi.models.Money): Money {
        return Money(moneyMpModel.amount, moneyMpModel.currencyCode)
    }
}