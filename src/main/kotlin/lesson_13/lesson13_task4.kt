package org.example.lesson_13

class ContactEntry(
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

    val phoneBook: MutableList<MyContact> = mutableListOf()

    fun addContact() {
        println("Введите имя контакта")
        val enterName = readln()

        println("Введите номер телефона")
        val enterPhone = readlnOrNull()?.toLongOrNull()
        if (enterPhone == null) {
            println("Вы не ввели номер телефона. Контакт не добавлен")
            return
        }
        println("Ведите название компании")
        val enterCompany = readln().takeIf { it.isNotBlank() }



        val contact = MyContact(enterName, enterPhone, enterCompany)
        phoneBook.add(contact)
        println("Контакт добавлен")
    }
    addContact()
    phoneBook.forEach { it.printPhoneBook() }
}