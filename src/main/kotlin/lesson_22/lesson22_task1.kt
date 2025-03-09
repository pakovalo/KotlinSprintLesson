package org.example.lesson_22

class RegularBook(
    name: String,
    author: String,
)
data class DataBook(
    private val name: String,
    private val author: String,
)

fun main() {
    val regularBook1 = RegularBook("Унесенные ветром", "Маргарет Митчелл")
    val regularBook2 = RegularBook("Унесенные ветром", "Унесенные ветром")

    val dataBook1 = DataBook("Унесенные ветром", "Маргарет Митчелл")
    val dataBook2= DataBook("Унесенные ветром", "Маргарет Митчелл")

    println("${regularBook1 == regularBook2}") //тут сравниваются ссылки на объекты. Они не равны так как это разные объекты в памяти.
    println("${dataBook1 == dataBook2}") //тут сравниваются свойства объектов,их содержимое. ПОтому они равны
}