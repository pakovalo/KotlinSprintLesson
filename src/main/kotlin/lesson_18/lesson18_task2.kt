package org.example.lesson_18

abstract class Dice {
    abstract val sides: Int

    fun roll() {
        val result = (1..sides).random()
        println("При броске кубика с $sides гранями выпало $result.")
    }
}

class FourSidesRoll: Dice () {
    override val sides: Int = 4
}

class SixSidesRoll: Dice () {
    override val sides: Int = 6
}

class EightSidesRoll: Dice () {
    override val sides: Int = 8
}

fun main() {
    val fourSides = FourSidesRoll()
    val sixSides = SixSidesRoll()
    val eightSides = EightSidesRoll()

    val allDice: List<Dice> = listOf(fourSides, sixSides, eightSides)
    for (i in allDice) {
        i.roll()
    }
}