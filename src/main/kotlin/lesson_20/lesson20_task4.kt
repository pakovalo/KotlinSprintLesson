package org.example.lesson_20

fun main() {
    val elements = listOf("Элемент 1", "Элемент 2", "Элемент 3", "Элемент 4", "Элемент 5", "Элемент 6")

    val clicks = elements.map {
        element -> {println("Нажат $element")}
    }
    clicks.forEachIndexed { index, unit ->
        if ((index + 1) % 2 ==0) unit()
    }

}