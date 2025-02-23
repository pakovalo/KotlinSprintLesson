package org.example.lesson_13

class NewTelephoneContact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
)

fun main() {

    val phoneBook = listOf(
        NewTelephoneContact("Иван Иванов", 89161234567),
        NewTelephoneContact("Петр Петров", 89031234567, "Reddit"),
        NewTelephoneContact("Анна Аннушкина", 89261234567, null),
        NewTelephoneContact("Мария Сидорова", 89361234567, "Google"),
        NewTelephoneContact("Михаил Новиков", 89461234567, "null")
    )
    val companies = phoneBook.mapNotNull { it.company }.filter { it != "null" }.distinct()
    companies.forEach { println(it) }
}