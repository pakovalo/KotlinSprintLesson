package org.example.lesson1_10.lesson_4

fun main() {

    val trainingDay = 6

    val honest: Boolean = trainingDay % 2 == 0

    println("Упражнения для рук:    ${honest.not()}\n" +
                "Упражнения для ног:    $honest\n" +
                "Упражнения для спины:  $honest\n" +
                "Упражнения для пресса: ${honest.not()}")

}