package org.example.lesson_21

import java.io.File

fun main() {
    val file = File("textFiles.txt")
    val text1 = "Первое сообщение"
    val text2 = "Второе сообщение"

    file.writeToFileAtBeginning(text1)
    file.writeToFileAtBeginning(text2)

    println (file.readText())
}
fun File.writeToFileAtBeginning (text: String) {
    val oldText = readText()
    val newText = text.lowercase() + "\n" + oldText
    writeText(newText)
}