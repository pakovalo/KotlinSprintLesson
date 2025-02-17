package org.example.lesson1_10.lesson_6

fun main() {
    var counter = 1
    val maxCounter = 5
    val numbers = (1..9).toList()
    val winNumber = numbers.random()
    var yourNumber = 0

    while (counter <= maxCounter && yourNumber != winNumber) {
        println("Введите число от 1 до 9")
        yourNumber = readln().toInt()

        if (yourNumber != winNumber && (maxCounter - counter) > NO_ATTEMPTS)
            println("Неверно, осталось ${maxCounter - counter} попытки")

        counter++
    }
    if (yourNumber == winNumber)
        println("Это была великолепная игра!")
    else
        println("Неверно было загадано число $winNumber")
}
const val NO_ATTEMPTS = 0