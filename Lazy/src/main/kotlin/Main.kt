class ConfigManager {

    val UserLanguage = "pt-br"

    val databaseConfig: Map<String, String> by lazy {
        loadDatabaseConfiguration()
    }

    private fun loadDatabaseConfiguration(): Map<String, String> {
        return mapOf(Pair("CONFIG", "dfsdfsd"))
    }

}


fun main() {
    //lazy - só faz o uso da memoria quando executado (caso não seja instanciado não consome nada)

    val configManager = ConfigManager()
    configManager.UserLanguage
    configManager.databaseConfig

}