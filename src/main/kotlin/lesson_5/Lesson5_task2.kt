package org.example.lesson_5

import java.time.LocalDate

fun main() {

    val currentDate = LocalDate.now()
    val currentYear = currentDate.year

    println("Введите свой возраст в четырехзначном формате")

    val yearOfBirth = readln().toInt()
    val age = currentYear - yearOfBirth

    if (age > AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")
    else
        println("В доступе отказано")
}

const val AGE_OF_MAJORITY = 18
