package org.example.lesson_17

class Users (login: String, password: String) {
    var login: String = login
        set(value) {
            field = value
            println("Логин успешно изменен. Новый логин: $value.")
        }
    var password: String = password
        set(value) {
            println("Вы не можете изменить пароль")
        }
        get() = "*".repeat(field.length)
}

fun main() {
    val user = Users("Qwerty", "Qwe123")

    println("Читаем пароль пользователя ${user.login}: ${user.password}")
    user.password = "123456"

    user.login = "newlogin"
}