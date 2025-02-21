package org.example.lesson_12

private class Weather4(daytimeTemperature: Int, nightTemperature: Int, downfall: Boolean) {


    init {
        println("Температура днем: ${daytimeTemperature - KELVIN_TO_CELSIUS}")
        println("Температура ночью: ${nightTemperature - KELVIN_TO_CELSIUS}")
        println("Наличие осадков: ${if (downfall) "есть" else "нет"}")
    }
}

fun main() {
    Weather4(daytimeTemperature = 310, nightTemperature = 300, downfall = true)
}
private const val KELVIN_TO_CELSIUS = 275