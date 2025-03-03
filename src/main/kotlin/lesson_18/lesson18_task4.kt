package org.example.lesson_18

import kotlin.math.pow

abstract class Box() {
    abstract fun surfaceAreaBox(): Double
}

class RectangularBox (
    private val length: Double,
    private val width: Double,
    private val height: Double,
): Box() {
    override fun surfaceAreaBox(): Double {
        return 2 * (length * width + width * height + height * length)
    }
}

class SquareBox(
    private val length: Double
): Box() {
    override fun surfaceAreaBox(): Double {
        return 6 * length.pow(2)
    }

}

fun main() {
    val rectangularBox = RectangularBox (5.0, 6.0, 7.0)
    println("Пложадь поверхности прямоугольной упаковки: ${rectangularBox.surfaceAreaBox()}")

    val squareBox =  SquareBox(6.0)
    println("Пложадь поверхности прямоугольной упаковки: ${squareBox.surfaceAreaBox()}")
}