package org.example.lesson_12

private class NewWeather(
    var daytimeTemperature: Int,
    var nightTemperature: Int,
    var downfall: Boolean,
) {
    fun printWeather() {
        println("Температура днем: $daytimeTemperature")
        println("Температура ночью: $nightTemperature")
        println("Наличие осадков: ${if (downfall) "есть" else "нет"}\n")
    }
}

fun main() {
    val weather = NewWeather(
    daytimeTemperature = 25,
    nightTemperature = 18,
    downfall = true,
    )
    weather.printWeather()
}