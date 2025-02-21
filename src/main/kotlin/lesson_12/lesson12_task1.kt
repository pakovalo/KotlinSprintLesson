package org.example.lesson_12

private class Weather {

    var daytimeTemperature: Int = 0
    var nightTemperature: Int = 0
    var downfall: Boolean = false

    fun printWeather() {
        println("Температура днем: $daytimeTemperature")
        println("Температура ночью: $nightTemperature")
        println("Наличие осадков: ${if (downfall) "есть" else "нет"}\n")
    }
}

fun main() {
    val weather1 = Weather()
        weather1.daytimeTemperature = 25
        weather1.nightTemperature = 18
        weather1.downfall = true

    val weather2 = Weather()
        weather1.daytimeTemperature = 30
        weather1.nightTemperature = 15
        weather1.downfall = false


    weather1.printWeather()
    weather2.printWeather()
}