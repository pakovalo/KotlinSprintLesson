package org.example.lesson1_10.lesson_4

fun main() {

    val weatherToday: Boolean = true
    val awningNow: Boolean = true
    val airHumidityNow: Int = 20
    val season: String = "зима"
    val conditions = weatherToday == SUN_WEATHER && awningNow == AWNING
            && airHumidityNow == AIR_HUMIDITY && season != SEASON

    print("Благоприятные ли условия для роста бобовых? $conditions")
}
const val SUN_WEATHER: Boolean = true
const val AWNING: Boolean = true
const val SEASON: String = "зима"
const val AIR_HUMIDITY = 20