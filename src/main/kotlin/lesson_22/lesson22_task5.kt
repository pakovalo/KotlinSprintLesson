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

    val (name, description, dateTime, distanceFromEarth) = alphaCentauri

    println("Название места или события: $name")
    println("Описание места или события: $description")
    println("Дата и время события: $dateTime")
    println("Расстояние от Земли: $distanceFromEarth световых лет")
}