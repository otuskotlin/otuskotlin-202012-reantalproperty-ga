package multiplatform.mappers

import model.User
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.NullValueCheckStrategy
import org.mapstruct.ReportingPolicy

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
interface UserMapper {
    fun toMultiplfatform(userBackModel: User): multiplatform.dto.User


    fun toBack(userMpModel: multiplatform.dto.User): User
}