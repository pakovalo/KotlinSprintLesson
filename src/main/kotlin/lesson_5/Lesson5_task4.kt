package org.example.lesson_5

fun main() {

    val login = "Zaphod"
    val password = "PanGalactic"

    println("Вас приветсвует бортовой робот Марвин! Введит свое имя пользователя:")
    val yourLogin = readln()

    if (login == yourLogin) {
        println("Введите свой пароль:")
        val yourPassword = readln()

        if (password == yourPassword)
            println("Добро пожаловать на борт корабля!")
        else
            println("Не верный пароль")
    } else {
        println("Пользователь в системе не найден! Просим Вас зарегистрироваться!")
    }
}