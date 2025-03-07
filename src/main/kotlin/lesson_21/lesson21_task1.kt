package org.example.lesson_21

fun String.vowelCounter(): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    return count { it in vowels }
}

fun main() {
    val text = "My lessons usually begin at nine o'clock"

    println("Колличество гласных букв в тексте: ${text.vowelCounter()}")
}