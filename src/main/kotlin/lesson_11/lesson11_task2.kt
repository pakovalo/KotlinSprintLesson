package org.example.lesson_11

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

fun main() {

    val user1 = User2(
        id=1,
        login = "user1",
        password = "password1",
        email = "user1@gmail.com",
    )
    println("Информация о пользователе user1")
    user1.printUser()

    user1.enterBiography()
    user1.updatePassword()
    user1.printUser()
}

