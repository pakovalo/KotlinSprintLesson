package org.example.lesson_22

import java.time.LocalDateTime

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: LocalDateTime,
    val distanceFromEarth: Double,
)

fun main() {
    val alphaCentauri = GalacticGuide(
        "Alpha Centauri",
        "Тройная звёздная система в созвездии Центавра",
        LocalDateTime.of(2025, 3, 8, 21, 30),
        4.36
    )

    println("Название места или события: ${alphaCentauri.component1()}")
    println("Описание места или события: ${alphaCentauri.component2()}")
    println("Дата и время события: ${alphaCentauri.component3()}")
    println("Расстояние от Земли: ${alphaCentauri.component4()} световых лет")
}