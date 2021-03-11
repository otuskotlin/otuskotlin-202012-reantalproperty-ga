package multiplatform.mappers

import model.enums.Lease

class LeaseTypeMapper {
    companion object {
        val INSTANCE: LeaseTypeMapper = LeaseTypeMapper()
    }

    fun toMultiplfatform(leaseTypeBackModel: Lease): multiplatform.dto.enums.Lease {
        return when (leaseTypeBackModel) {
            Lease.DAY -> multiplatform.dto.enums.Lease.DAY
            Lease.HALF_OF_YEAR -> multiplatform.dto.enums.Lease.HALF_OF_YEAR
            Lease.HOUR -> multiplatform.dto.enums.Lease.HOUR
            Lease.MONTH -> multiplatform.dto.enums.Lease.MONTH
            Lease.ONE_YEAR_AND_MORE -> multiplatform.dto.enums.Lease.ONE_YEAR_AND_MORE
            Lease.WEEK -> multiplatform.dto.enums.Lease.WEEK
            else -> throw RuntimeException("No match for this Lease - $leaseTypeBackModel")
        }
    }


    fun toBack(leaseTypeMpModel: multiplatform.dto.enums.Lease): Lease {
        return when (leaseTypeMpModel) {
            multiplatform.dto.enums.Lease.DAY -> Lease.DAY
            multiplatform.dto.enums.Lease.HALF_OF_YEAR -> Lease.HALF_OF_YEAR
            multiplatform.dto.enums.Lease.HOUR -> Lease.HOUR
            multiplatform.dto.enums.Lease.MONTH -> Lease.MONTH
            multiplatform.dto.enums.Lease.ONE_YEAR_AND_MORE -> Lease.ONE_YEAR_AND_MORE
            multiplatform.dto.enums.Lease.WEEK -> Lease.WEEK
            else -> throw RuntimeException("No match for this Lease - $leaseTypeMpModel")
        }
    }
}