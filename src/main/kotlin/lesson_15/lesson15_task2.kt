package org.example.lesson_15

abstract class WeatherStationStats {
    abstract val value: Double
    abstract val unit: String
}

class Temperature (override val value: Double): WeatherStationStats() {
    override val unit: String = "°C"
        }

class PrecipitationAmount(override val value: Double): WeatherStationStats() {
    override val unit: String = "mm"
}

class WeatherServer {
    fun send (data: WeatherStationStats) {
        when (data) {
            is Temperature -> println("Отправляем данные о температуре: ${data.value}${data.unit}")
            is PrecipitationAmount -> println("Отправляем данные о осадках: ${data.value}${data.unit}")
        }
    }
}

fun  main(){
    val temperature = Temperature(6.4)
    val precipitation = PrecipitationAmount(20.0)

    val weatherServer = WeatherServer()

    weatherServer.send(temperature)
    weatherServer.send(precipitation)
}