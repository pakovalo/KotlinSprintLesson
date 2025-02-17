package org.example.lesson1_10.lesson_3

import java.time.LocalTime

fun main() {

    val name = "Александр"
    val day = LocalTime.of(9, 0)
    val night = LocalTime.of(20, 0)
    val currentTime = LocalTime.now()
    val greetings: String

    if (currentTime < night && currentTime > day) {
        greetings = "Добрый день"
    } else {
        greetings = "Добой ночи"
    }

    val greetingsText = "$greetings, $name!"

    print(greetingsText)

}