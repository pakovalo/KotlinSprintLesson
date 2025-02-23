package org.example.lesson_12

private class Weather4(daytimeTemperature: Int, nightTemperature: Int, isDownfall: Boolean) {

    val daytimeTemperature = daytimeTemperature - KELVIN_TO_CELSIUS
    val nightTemperature = nightTemperature - KELVIN_TO_CELSIUS

    init {
        println("Температура днем: ${this.daytimeTemperature}")
        println("Температура ночью: ${this.nightTemperature}")
        println("Наличие осадков: ${if (isDownfall) "есть" else "нет"}")
    }
}

fun main() {
    Weather4(daytimeTemperature = 310, nightTemperature = 300, isDownfall = true)
}
private const val KELVIN_TO_CELSIUS = 275