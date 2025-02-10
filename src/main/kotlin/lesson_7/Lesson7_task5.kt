package org.example.lesson_7

fun main() {

    val lowercaseLetter = 'a'..'z'
    val uppercaseLetter = 'A'..'Z'
    val numbers = 1..9
    var password = ""

    println("Введите число символов в пароле. пароль должен быть не меннее 6 символов")
    var numberOfCharacters = readln().toInt()

    if (numberOfCharacters < MIN_PASSWORD) {
        do {
            println("Введите число символов в пароле. пароль должен быть не меннее 6 символов")
            numberOfCharacters = readln().toInt()
        } while (numberOfCharacters < MIN_PASSWORD)
    }
    for (i in 1..numberOfCharacters) {
        val randomiser = listOf(lowercaseLetter.random(), uppercaseLetter.random(), numbers.random()).random()
        password = password + randomiser
        }

    println(password)
}

const val MIN_PASSWORD = 6