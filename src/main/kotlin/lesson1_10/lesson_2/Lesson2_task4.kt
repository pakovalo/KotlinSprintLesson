package org.example.lesson1_10.lesson_2

fun main () {

    val ironOre = 11
    val cristallineOre = 7
    val buffPercent = 20
    val bonusIronOre = (ironOre * buffPercent / ALL_PERCENT)
    val bonusCristallineOre = (cristallineOre * buffPercent / ALL_PERCENT)

    println("Колличество бонусной железной руды: $bonusIronOre")
    println("Колличество бонусной кристалической руды: $bonusCristallineOre")

}

const val ALL_PERCENT = 100