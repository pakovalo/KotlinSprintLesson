package org.example.lesson1_10.lesson_2

import kotlin.math.pow

fun main () {

    val deposit = 70000
    val percent = 16.7
    val durationOfDeposit = 20
    val finalDeposite = deposit * ((1 + (percent / ALL_PERCENT1)).pow(durationOfDeposit))
    val depositeToPrint = String.format("Итоговая сумма: %.3f", finalDeposite)

    print(depositeToPrint)

}

const val ALL_PERCENT1 = 100