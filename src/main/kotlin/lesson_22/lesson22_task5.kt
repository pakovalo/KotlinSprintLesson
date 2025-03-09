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

    println("Название места или события: ${alphaCentauri.name}")
    println("Описание места или события: ${alphaCentauri.description}")
    println("Дата и время события: ${alphaCentauri.dateTime}")
    println("Расстояние от Земли: ${alphaCentauri.distanceFromEarth} световых лет")
}