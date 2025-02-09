package org.example.lesson_5

fun main (){

    val rangeNumbers = (1..42).toList()
    val randomNumber1 = rangeNumbers.random()
    val randomNumber2 = rangeNumbers.random()
    val randomNumber3 = rangeNumbers.random()
    val randomNumber = listOf(randomNumber1, randomNumber2, randomNumber3)

    println("Введите первое число от 0 до 42")
    val yourNumbeer1 = readln().toInt()

    println("Введите второе число от 0 до 42")
    val yourNumbeer2 = readln().toInt()

    println("Введите третье число от 0 до 42")
    val yourNumbeer3 = readln().toInt()

    val yourNumbers = listOf(yourNumbeer1, yourNumbeer2, yourNumbeer3)
    val result = yourNumbers.intersect(randomNumber)
    val guessedNumbers = result.size

    when (guessedNumbers) {
        3 -> println("Вы угадали все числа и выиграли джекпот!\n")
        2 -> println("Вы угадали два числа и выиграли крупный приз!\n")
        1 -> println("Вы угадали одно число и выиграли утешительный приз!\n")
        0 -> println("Увы, совпадений нет!\n")
    }
    println("Выигрышные числа $randomNumber!")
}