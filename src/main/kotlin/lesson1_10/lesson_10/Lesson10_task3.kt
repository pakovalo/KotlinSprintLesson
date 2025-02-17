package org.example.lesson1_10.lesson_10

fun main() {

    println("Введите длину пароля:")
    val passwordLength = readLine()?.toIntOrNull() ?: 0
    val password = org.example.lesson1_10.lesson_10.generatePassword(passwordLength)
    println(password)
}

fun generatePassword (passwordLength: Int): String {

    val number = (0..9).toList()
    val specialCharacters = listOf('!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ' ')
    var password = ""

    for (i in 1..passwordLength) {
        if (i % 2 == 0)
            password = password + specialCharacters.random().toString()
        else password = password + number.random()
    }
    return password
}
