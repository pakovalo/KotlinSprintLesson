package org.example.lesson_6

fun main() {
    var notCorrectedLogin: Boolean = true

    println("Веедите логин своего будущего аккаунта")
    val login = readln().toString()

    println("Веедите пароль")
    val password = readln().toString()

    println("Ваш аккаунт зарегестрирован!")

    while (notCorrectedLogin) {
        println("Веедите логин:")
        val enterLogin = readln().toString()

        println("Веедите Ваш пароль:")
        val enterPassword = readln().toString()

        if (enterLogin == login && enterPassword == password) {
            notCorrectedLogin = false
            println("Авторизация прошла успешно")
        } else {
            println("Неверный логин или пароль. Попробуйте снова.")
        }
    }

}