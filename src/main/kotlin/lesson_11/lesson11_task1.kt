package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {

    val user1 = User(
        id=1,
        login = "user1",
        password = "password1",
        email = "user1@gmail.com",
        )

    val user2 = User(
        id = 2,
        login = "user2",
        password = "password2",
        email = "user2@gmail.com"
    )

    println("User 1: ID=${user1.id}, Login=${user1.login}, Password=${user1.password}, Email=${user1.email}")
    println("User 2: ID=${user2.id}, Login=${user2.login}, Password=${user2.password}, Email=${user2.email}")

}
