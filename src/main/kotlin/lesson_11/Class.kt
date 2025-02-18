package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null,
) {
    fun printUser() {
        println("id Пользователя: $id")
        println("Логин пользователя: $login")
        println("Пароль пользователя: $password")
        println("Email Пользователя: $email")
        println("Информация о пользователе: ${bio ?: "Не указано"}")

    }

    fun enterBiography() {
        println("Напишите о себе:")
        bio = readln()
        println("Информация обновлена.")

    }

    fun updatePassword() {
        println("Если вы хотете поменять пароль введите текущий:")
        val currentPassword = readln()
        if (currentPassword == password) {
            println("Введите новый пароль:")
            val newPassword = readln()
            password = newPassword
            println("Пароль успешно изменен!")
        } else println("Не верный пароль.")
    }
}