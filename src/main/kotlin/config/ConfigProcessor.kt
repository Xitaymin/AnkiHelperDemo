package org.demotdd.config

import java.util.Properties

// Використовуйте цей клас для роботи з конфігураційним файлом
class ConfigProcessor {
    private val properties = Properties()

    init {
        val inputStream = this::class.java.classLoader.getResourceAsStream("config.properties")
        inputStream?.use { properties.load(it) } ?: throw IllegalArgumentException("config.properties not found")
    }

    fun getApiKey(): String {
        return properties.getProperty("deepl.api.key")
    }

    fun setApiKey(key: String): Unit {
        properties.setProperty("deepl.api.key", key)
    }

}