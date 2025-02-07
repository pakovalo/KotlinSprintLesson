package org.example.lesson_5

fun main () {

    val number1 = 8
    val number2 = 33
    var numbersOfMatches: Int = 0

    println("Введите первое число от 0 до 42")
    val yourNumber1 = readln().toInt()

    println("Введите второе число от 0 до 42")
    val yourNumber2 = readln().toInt()

    println("Верные числа $number1 и $number2")

    when (yourNumber1) {
        number1 -> numbersOfMatches = numbersOfMatches + 1
        number2 -> numbersOfMatches = numbersOfMatches + 1
    }
    when (yourNumber2) {
        number1 -> numbersOfMatches = numbersOfMatches + 1
        number2 -> numbersOfMatches = numbersOfMatches + 1
    }

    if (numbersOfMatches == 0)
        println("Неудача!")
    else if  (numbersOfMatches == 1)
        println("Вы выиграли утешительный приз!")
    else
        println("Поздравляем! Вы выиграли главный приз!")
}