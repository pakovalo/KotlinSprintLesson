package org.example.lesson_10

fun main() {

    var counterWins = 0
    var playAgain = true

    while (playAgain) {
        val result = round()

        when (result) {
            "man" -> {
                println("Вы победили!")
                counterWins++
            }
            "comp" -> println("Победил компьютер!")
            else -> println("Ничья")
        }
        println("Хотите продолжить игру? Да или нет?")
        val wannaPlay = readln().lowercase()

        if (wannaPlay == "да")
            playAgain = true
        else playAgain = false
    }
    println("Конец игры. Вы выиграли $counterWins партий.")
}

fun round(): String {

    val numberTheDiceComp = throwTheDice()
    val numberTheDiceMan = throwTheDice()

    println("Бросок кубика машиной: $numberTheDiceComp")
    println("Бросок кубика человеком: $numberTheDiceMan")

    return when {

        numberTheDiceComp > numberTheDiceMan -> "comp"
        numberTheDiceMan > numberTheDiceComp -> "man"

        else -> "draw"
    }
}

fun throwTheDice(): Int { return (1..6).random() }

