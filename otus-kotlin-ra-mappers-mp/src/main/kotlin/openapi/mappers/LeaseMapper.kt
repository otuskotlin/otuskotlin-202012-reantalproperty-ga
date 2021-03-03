package openapi.mappers

import model.enums.Lease
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy
import org.mapstruct.factory.Mappers

@Mapper(unmappedSourcePolicy = ReportingPolicy.ERROR)
open class LeaseMapper {

    companion object {
        val INSTANCE: LeaseMapper = Mappers.getMapper(LeaseMapper::class.java)
    }

    fun toOpenApi(leaseBackModel: Lease): org.example.transport.openapi.models.Lease {
        return when (leaseBackModel) {
            Lease.DAY -> org.example.transport.openapi.models.Lease.day
            Lease.HALF_OF_YEAR -> org.example.transport.openapi.models.Lease.halfOfYear
            Lease.HOUR -> org.example.transport.openapi.models.Lease.hour
            Lease.MONTH -> org.example.transport.openapi.models.Lease.month
            Lease.ONE_YEAR_AND_MORE -> org.example.transport.openapi.models.Lease.oneYearAndMore
            Lease.WEEK -> org.example.transport.openapi.models.Lease.week
            else ->  throw RuntimeException("No match for this Lease - $leaseBackModel")
        }

    }


    fun toBack(leaseOpenapiModel: org.example.transport.openapi.models.Lease): Lease {
        return when (leaseOpenapiModel) {
            org.example.transport.openapi.models.Lease.day -> Lease.DAY
            org.example.transport.openapi.models.Lease.halfOfYear -> Lease.HALF_OF_YEAR
            org.example.transport.openapi.models.Lease.hour -> Lease.HOUR
            org.example.transport.openapi.models.Lease.month -> Lease.MONTH
            org.example.transport.openapi.models.Lease.oneYearAndMore -> Lease.ONE_YEAR_AND_MORE
            org.example.transport.openapi.models.Lease.week -> Lease.WEEK
        }

    }
}