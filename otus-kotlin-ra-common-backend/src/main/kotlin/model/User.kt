package model

data class User(
    val id: IdModel,
    var login: String,
    var fName: String?,
    var sName: String?,
)
