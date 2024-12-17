package org.demotdd.io

// Використовуйте цей клас для роботи з консоллю
class ConsoleProcessor {
    fun writeToConsole(message: String) {
        println(message)
    }

    fun readFromConsole(): String {
        return readlnOrNull() ?: ""
    }
}