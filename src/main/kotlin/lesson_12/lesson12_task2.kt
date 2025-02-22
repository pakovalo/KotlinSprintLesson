package org.example.lesson_12

private class NewWeather(
    val daytimeTemperature: Int,
    val nightTemperature: Int,
    val isDownfall: Boolean,
) {
    fun printWeather() {
        println("Температура днем: $daytimeTemperature")
        println("Температура ночью: $nightTemperature")
        println("Наличие осадков: ${if (isDownfall) "есть" else "нет"}\n")
    }
}

fun main() {
    val weather = NewWeather(
    daytimeTemperature = 25,
    nightTemperature = 18,
    isDownfall = true,
    )
    weather.printWeather()
}