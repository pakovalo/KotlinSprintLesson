package org.example.lesson_16

class UserInfo {
    private val login = "User1"
    private val password = "Qwe123"

    fun validate (enterPassword: String): Boolean {
        return enterPassword == password
    }
}
fun main() {
    println("Ведите пароль:")
    val enterPassword = readln()

    val valid: Boolean = UserInfo().validate(enterPassword)
    if (valid) println("Пароль корректный") else println("Пороль не верен")
}