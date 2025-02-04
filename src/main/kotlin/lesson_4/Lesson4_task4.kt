package org.example.lesson_4

fun main() {

    val trainingDay = 5

    if (trainingDay % 2 == 0) {
        println("Упражнения для рук:    true\n" +
                "Упражнения для ног:    false\n" +
                "Упражнения для спины:  false\n" +
                "Упражнения для пресса: true")
    } else {
        println("Упражнения для рук:     false\n" +
            "Упражнения для ног:     true\n" +
            "Упражнения для спины:   true\n" +
            "Упражнения для пресса:  false")

    }

}