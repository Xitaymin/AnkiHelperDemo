package config
import java.util.Properties
import java.io.FileOutputStream

// Використовуйте цей клас для роботи з конфігураційним файлом
class ConfigProcessor {
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

    fun setApiKey(key: String) {
        properties.setProperty("deepl.api.key", key)
        saveProperties()
    }

    private fun saveProperties() {
        val fileUrl = this::class.java.classLoader.getResource(configFileName)
            ?: throw IllegalArgumentException("$configFileName not found")

        FileOutputStream(fileUrl.path).use { outputStream ->
            properties.store(outputStream, "Updated deepl.api.key")
        }
    }
}
