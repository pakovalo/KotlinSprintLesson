package org.example.lesson_10

fun main() {

    println("Придумайте логин")
    val login = readln()

    println("Придумайте пароль")
    val password = readln()

    checkLength(login, password)
}

fun checkLength(login: String, password: String) {

    if (login.length < 4 || password.length < 4)
        println("Логин или пароль недостаточной длинны")

}