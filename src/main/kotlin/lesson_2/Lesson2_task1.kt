package org.example.lesson_2

fun main () {

    val numbersOfStudents = 4
    val studentScore1 = 3
    val studentScore2 = 4
    val studentScore3 = 3
    val studentScore4 = 5
    val sumScore = (studentScore1 + studentScore2 + studentScore3 + studentScore4).toFloat()
    val averageScore = (sumScore/numbersOfStudents)

    print("Средний бал: $averageScore")

}