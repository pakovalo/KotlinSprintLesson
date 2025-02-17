package org.example.lesson1_10.lesson_4

fun main () {

    val allTable = 13
    val reservedToday = 13
    val reservedTomorrow = 9

    print("Доступность столиков на сегодня: ${reservedToday < allTable} \nДоступность столиков на завтра: ${reservedTomorrow < allTable}")
}