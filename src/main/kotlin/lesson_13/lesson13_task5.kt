package org.example.lesson_13

class MyContact(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printPhoneBook() {
        println("Имя контакта: $name")
        println("Номер телефона: $phoneNumber")
        println("Компания: ${company ?: "не указано"}")
    }
}

fun main(){
    fun readPhoneNumber(): Long? {
        println("Введите номер телефона")
        val enterPhone = readln()
        return try {
            enterPhone.toLong()
        } catch (e: NumberFormatException) {
            println("${e::class.simpleName}")
            null
        }
    }

    println("Введите имя контакта")
    val enterName = readln()

    val phoneNumber = readPhoneNumber()
    if (phoneNumber == null) {
        println("Не корректный номер телефона")
        return
    }

    println("Ведите название компании")
    val enterCompany = readln().takeIf { it.isNotBlank() }

    val contact = MyContact(enterName, phoneNumber, enterCompany)
    println("Контакт добавлен")

    contact.printPhoneBook()
}