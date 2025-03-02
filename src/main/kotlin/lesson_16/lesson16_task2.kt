package org.example.lesson_16

import kotlin.math.pow

private class Circle (private val radius: Double) {

    fun circumference() {
        println("Длинна окружности радиусом $radius равна: ${2 * PI * radius}")
    }

    fun areaOfCircle() {
        println("Площадь окружности радиусом $radius  равна: ${PI * radius.pow(2)}")
    }
}

fun main() {
    val circle = Circle(5.5)
    circle.areaOfCircle()
    circle.circumference()
}

private const val PI = 3.14