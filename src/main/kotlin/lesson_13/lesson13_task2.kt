package org.example.lesson_13

class TelephoneContact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printContact() {
        println("-Имя: $name \n-Номер: $phoneNumber\n-Компания: ${company ?: "не указано"}")
    }
}

fun main(){
    val contact = TelephoneContact("Ростислав", 89123456789, "Reddit")
    contact.printContact()
}