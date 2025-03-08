package org.example.lesson_22

class RegularBook2(
    name: String,
    author: String,
)
data class DataBook2(
    private val name: String,
    private val author: String,
)

fun main() {
    val regularBook1 = RegularBook2("Унесенные ветром", "Маргарет Митчелл")
    val dataBook1 = DataBook2("Унесенные ветром", "Маргарет Митчелл")

    println(regularBook1) //отображает имя класса и хэш, т.к. не переопределяет метод toString
    println(dataBook1)  //Пререопределяет метод toString, потому отображается имена свойств и их значения
}