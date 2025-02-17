package org.example.lesson1_10.lesson_10

fun main() {

    println("Придумайте логин не менее 4 символов")
    val login = readln()

    println("Придумайте пароль не менее 4 символов")
    val password = readln()
    if (validateCredentials(login) && validateCredentials(password)) {
        println("Регистрация прошла успешно! Добро пожаловать, $login!")
    } else {
        println("Логин или пароль недостаточно длинные.")
    }

}

fun validateCredentials(credential: String): Boolean { return credential.length >= 4 }