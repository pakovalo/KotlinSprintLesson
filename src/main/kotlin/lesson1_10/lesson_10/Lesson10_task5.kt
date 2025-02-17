package org.example.lesson1_10.lesson_10

fun main() {

    val login = "user"
    val password = "userpassword"

    println("Введите имя пользователя:")
    val yourLogin = readln()

    println("Введите пароль:")
    val yourPassword = readln()

    val token = verification(yourLogin, yourPassword, login, password)
    println(token)

    if (token != null) {
        println("Ваша авторизация прошла успешно.\nВаша корзина: ${youBasket(token)}")
    } else println("Неверный логин или пароль")
}

fun verification(yourLogin: String, yourPassword: String, login: String, password: String): String? {
    return if (login == yourLogin && password == yourPassword) { createToken() } else { null }
}

fun createToken():String {
    val symbolsForToken = (1..9) + ('a'..'z')
    return (1..32).map { symbolsForToken.random() }.joinToString ("")
}

fun youBasket (token: String): List<String>? {
    val basket = listOf("Лук", "Чеснок", "Мука", "Хлеб", "Соль", "Перец")
    return if (token.length == 32) basket else null
}