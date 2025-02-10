package org.example.lesson_7

fun main() {
    val passwordLenght = 16
    val numberForPassword: IntRange = 1..2
    val lettersForPassword: CharRange = 'a'..'z'
    var password = ""

    for (i in 1..passwordLenght step (CHARACTERS_PER_CYCLE)) {
        password = password + lettersForPassword.random() + numberForPassword.random()
    }
    println(password)
}

const val CHARACTERS_PER_CYCLE = 2