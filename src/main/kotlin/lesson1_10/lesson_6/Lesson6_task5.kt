package org.example.lesson1_10.lesson_6

fun main() {
    var counter = 1
    val rangeNumbers = (1..9).toList()

    do {
        val randomNumber1 = rangeNumbers.random()
        val randomNumber2 = rangeNumbers.random()
        val sum = randomNumber1 + randomNumber2

        println("Ведите резултат слодения двух чисел : $randomNumber1 и $randomNumber2")
        val result = readln().toInt()

        if (result == sum && counter <= MAX_ATTEMPTS)
            println("Добро пожаловать!")
        else if (counter == MAX_ATTEMPTS)
            println("Доступ запрещен")
        counter++
    } while (randomNumber1 + randomNumber2 != result && counter <= MAX_ATTEMPTS)
}
const val MAX_ATTEMPTS = 3
