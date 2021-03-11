import kotlinx.serialization.json.Json

val jsonConfig: Json by lazy {
    Json {
        prettyPrint = true

    }
}