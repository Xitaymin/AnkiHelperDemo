package org.demotdd.io

import java.nio.file.Path

// Використовуйте цей клас для роботи з файлами
class FileProcessor {
    fun readLinesFromFile(inputPath: Path): List<String> = inputPath.toFile().readLines()

    fun readFromFile(inputPath: Path): String = inputPath.toFile().readText()

    fun writeToFile(outputPath: Path, text: String) = outputPath.toFile().writeText(text)
}