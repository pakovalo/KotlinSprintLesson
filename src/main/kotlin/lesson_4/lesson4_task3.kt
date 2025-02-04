package org.example.lesson_4

fun main() {

    val weatherToday: Boolean = true
    val awningNow: Boolean = true
    val airHumidity: Int = 20
    val season: String = "зима"
    val conditions = weatherToday == true && awningNow == true && airHumidity ==20 && season != "зима"

    print("Благоприятные ли условия для роста бобовых? $conditions")

}