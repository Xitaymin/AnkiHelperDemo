package config
import java.util.Properties

// Використовуйте цей клас для роботи з конфігураційним файлом
class ConfigReader {
    private val properties = Properties()
    private val configFileName = "config.properties"

    init {
        val inputStream = this::class.java.classLoader.getResourceAsStream(configFileName)
        inputStream?.use { properties.load(it) } ?: throw IllegalArgumentException("$configFileName not found")
    }

    fun getApiKey(): String? = try {
        properties.getProperty("deepl.api.key")
    } catch (e: Exception) {
        null
    }
}
