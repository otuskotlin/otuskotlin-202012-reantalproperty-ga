package multiplatform.mappers

import model.User

class UserMapper {
    companion object {
        val INSTANCE: UserMapper = UserMapper()
    }

    fun toMultiplfatform(userBackModel: User): multiplatform.dto.User {
        return multiplatform.dto.User(userBackModel.id,
            userBackModel.firstName,
            userBackModel.secondName)
    }


    fun toBack(userMpModel: multiplatform.dto.User): User {
        return User(userMpModel.id,
            userMpModel.firstName,
            userMpModel.secondName)
    }
}