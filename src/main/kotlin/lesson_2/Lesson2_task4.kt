package org.example.lesson_2

fun main () {

    val ironOre = 11
    val cristallineOre = 7
    val buffPercent = 20
    val bonusIronOre = (ironOre*buffPercent/100)
    val bonusCristallineOre = (cristallineOre*buffPercent/100)

    println("Колличество бонусной железной руды: $bonusIronOre")
    println("Колличество бонусной кристалической руды: $bonusCristallineOre")

}