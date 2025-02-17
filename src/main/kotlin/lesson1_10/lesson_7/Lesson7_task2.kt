package org.example.lesson1_10.lesson_7

fun main() {

    val smsRange = 1000..9999

    do {
        val sms = smsRange.random()

        println("Ваш код авторизации : $sms")
        println("Введите код авторизации")
        val yourEnterCode = readln().toInt()

    } while (yourEnterCode != sms)

    println("Добро пожаловать!")
}