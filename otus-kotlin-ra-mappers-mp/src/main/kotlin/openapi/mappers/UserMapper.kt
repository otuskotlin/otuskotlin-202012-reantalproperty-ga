package openapi.mappers

import model.User
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy
import org.mapstruct.factory.Mappers


@Mapper(unmappedSourcePolicy = ReportingPolicy.ERROR)
open class UserMapper {
    companion object {
        val INSTANCE: UserMapper = Mappers.getMapper(UserMapper::class.java)
    }

    fun toOpenApi(userBackModel: User): org.example.transport.openapi.models.User {

        return org.example.transport.openapi.models.User(userBackModel.id,
            userBackModel.firstName,
            userBackModel.secondName)
    }

    fun toBack(userMpModel: org.example.transport.openapi.models.User): User {
        return User(userMpModel.id,
            userMpModel.firstName,
            userMpModel.secondName)
    }
}