package org.example.lesson_22

data class DataBook3(
    val name: String,
    val author: String,
    val year: Int,
)

fun main() {

    val dataBook = DataBook3("Унесенные ветром", "Маргарет Митчелл", 1936)
    val (name, author, year) = dataBook

    println("Название: $name, Автор: $author, Год: $year")
}