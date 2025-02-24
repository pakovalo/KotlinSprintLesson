package org.example.lesson_14

import kotlin.math.PI
import kotlin.math.pow

abstract class Figure(
    val color: String,
) {
    abstract fun calcArea(): Double
    abstract fun calcPerimeter(): Double
}
class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun calcArea(): Double {
        return PI * radius.pow(2)
    }

    override fun calcPerimeter(): Double {
        return 2 * PI * radius
    }
}
class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
): Figure(color) {
    override fun calcArea(): Double {
        return width * height
    }

    override fun calcPerimeter(): Double {
        return 2 * width * height
    }
}

fun main() {

    val figures = mutableListOf(
        Circle("черный", 15.0),
        Rectangle("черный", 20.0, 18.0),
        Circle("черный", 8.0),
        Rectangle("черный", 13.0, 4.0),
        Circle("белый", 13.0),
        Rectangle("белый", 18.0, 6.0),
        Circle("белый", 7.0),
        Rectangle("белый", 7.0, 18.0),
    )
    val sumBlackPerimeters = figures
        .filter { it.color == "черный" }
        .sumOf { it.calcPerimeter() }
    val sumWhiteAreas = figures
        .filter { it.color == "белый" }
        .sumOf { it.calcArea() }

    println("Сумма периметров всех черных фигур: $sumBlackPerimeters")
    println("Сумма площадей всех белых фигур: $sumWhiteAreas")

}