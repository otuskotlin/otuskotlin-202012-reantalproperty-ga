package model

import kotlinx.serialization.Serializable

@Serializable
 class IdModel(val id: String) {
    companion object {
        val NONE = IdModel("")
    }
}