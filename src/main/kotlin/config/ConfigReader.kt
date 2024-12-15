package org.demotdd.config

import java.util.Properties


class ConfigReader {
    private val properties = Properties()

    init {
        val inputStream = this::class.java.classLoader.getResourceAsStream("config.properties")
        inputStream?.use { properties.load(it) } ?: throw IllegalArgumentException("config.properties not found")
    }

    fun getApiKey(): String {
        return properties.getProperty("deepl.api.key")
    }
}