package multiplatform.mappers

import model.enums.Lease
import org.mapstruct.Mapper
import org.mapstruct.NullValueCheckStrategy
import org.mapstruct.ReportingPolicy
import org.mapstruct.factory.Mappers

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
interface LeaseTypeMapper {
    companion object {
        val INSTANCE: LeaseTypeMapper = Mappers.getMapper(LeaseTypeMapper::class.java)
    }

    fun toMultiplfatform(leaseTypeBackModel: Lease): multiplatform.dto.enums.Lease


    fun toBack(leaseTypeMpModel: multiplatform.dto.enums.Lease): Lease
}