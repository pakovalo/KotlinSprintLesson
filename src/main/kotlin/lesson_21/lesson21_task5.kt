package org.example.lesson_21

fun main() {
    val listSkills = mapOf<String,Int>(
        "Лечение" to 100,
        "Урон" to 110,
        "Броня" to 150,
        "Уворот" to 120,
        "Сила" to 130,
        "Ловкость" to 80,
        "Интелект" to 150
    )
    println(listSkills.maxCategory())
}

fun Map<String, Int>.maxCategory (): String {
    return maxBy { it.value }.key
}