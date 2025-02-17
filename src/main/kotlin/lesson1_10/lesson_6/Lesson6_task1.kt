package org.example.lesson1_10.lesson_6

fun main() {

    println("Веедите логин своего будущего аккаунта")
    val login = readln()

    println("Веедите пароль")
    val password = readln()

    println("Ваш аккаунт зарегестрирован!")

    do {
        println("Веедите логин:")
        val enterLogin = readln()

        println("Веедите Ваш пароль:")
        val enterPassword = readln()

    } while (enterLogin != login && enterPassword != password)

    println("Авторизация прошла успешно")

}