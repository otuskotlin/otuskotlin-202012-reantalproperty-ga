package openapi.mappers

import model.User


open class UserMapper {
    companion object {
        val INSTANCE: UserMapper = UserMapper()
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