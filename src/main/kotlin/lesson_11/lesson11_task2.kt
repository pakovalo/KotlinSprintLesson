package org.example.lesson_11

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

