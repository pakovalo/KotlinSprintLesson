package org.example.lesson_7

fun main() {

    val lowercaseLetter = 'a'..'z'
    val uppercaseLetter = 'A'..'Z'
    val numbers = 1..9
    var password = ""
    val fullSymbols = lowercaseLetter + uppercaseLetter + numbers

    println("Введите число символов в пароле. пароль должен быть не меннее 6 символов")
    var numberOfCharacters = readln().toInt()

    if (numberOfCharacters < MIN_PASSWORD) {
        do {

            println("Введите число символов в пароле. пароль должен быть не меннее 6 символов")
            numberOfCharacters = readln().toInt()

        } while (numberOfCharacters < MIN_PASSWORD)
    }

    for (i in 1..numberOfCharacters)
        password = password + fullSymbols.random()

    println(password)
}

const val MIN_PASSWORD = 6