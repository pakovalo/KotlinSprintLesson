package org.example.lesson_18

class Screen {

    fun draw (figure: String, x: Int, y: Int): String {
        return "Нарисован $figure в координатах (Int): ($x, $y)"
    }
    fun draw (figure: String, x: Float, y: Float): String {
        return "Нарисован $figure в координатах (Float): ($x, $y)"
    }
}

fun main() {
    val screen = Screen()

    println(screen.draw("Круг", 5, 10))
    println(screen.draw("Круг", 5.0f, 1.5f))

    println(screen.draw("Квадрат", 15, 18))
    println(screen.draw("Квадрат", 50.0f, 1.9f))

    println(screen.draw("Точка", 7, 14))
    println(screen.draw("Точка", 20.1f, 17.9f))
}