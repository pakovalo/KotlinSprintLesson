package org.example.lesson1_10.lesson_8

fun main () {

    val monday = 1
    val tuesday = 2
    val wednesday = 3
    val thursday = 4
    val friday = 5
    val saturday = 6
    val sunday = 7
    val week: IntArray = intArrayOf(monday, tuesday, wednesday, thursday, friday, saturday, sunday)

    println("Сумма просмотров: ${week.sum()}")
}