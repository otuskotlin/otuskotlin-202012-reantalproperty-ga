package model

data class IdModel(val id: String) {
    companion object {
        val NONE = IdModel("")
    }
}