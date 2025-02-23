package org.example.lesson_12

private class Weather3(daytimeTemperature: Int, nightTemperature: Int, downfall: Boolean) {

    val daytimeTemperature = daytimeTemperature - KELVIN_TO_CELSIUS
    val nightTemperature = nightTemperature - KELVIN_TO_CELSIUS
    val isDownfall = downfall

    fun printWeather() {
        println("Температура днем: $daytimeTemperature")
        println("Температура ночью: $nightTemperature")
        println("Наличие осадков: ${if (isDownfall) "есть" else "нет"}")
    }
}

fun main() {
    val weather1 = Weather3(daytimeTemperature = 310, nightTemperature = 300, downfall = true)
    weather1.printWeather()
}
private val KELVIN_TO_CELSIUS = 275