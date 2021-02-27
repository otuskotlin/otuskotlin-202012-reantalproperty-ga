package multiplatform.mappers

import model.Address
import org.mapstruct.Mapper
import org.mapstruct.NullValueCheckStrategy
import org.mapstruct.ReportingPolicy
import org.mapstruct.factory.Mappers

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
interface AddressMapper {
    companion object {
        val INSTANCE: AddressMapper
                = Mappers.getMapper(AddressMapper::class.java)
    }

    fun toMultiplfatform(addressBackModel: Address): multiplatform.dto.Address


    fun toBack(adressMpModel: multiplatform.dto.Address): Address
}
