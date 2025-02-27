package org.example.lesson_15

interface Flyable {
    fun fly()
}
interface Swimmable {
    fun swim()
}
class CrucianCarp: Swimmable {
    override fun swim() {
        println("Карась плавает")
    }
}
class Seagull: Flyable, Swimmable {
    override fun fly() {
        println("Чайка летает")
    }

    override fun swim() {
        println("Чайка плавает")
    }

}
class Duck: Swimmable, Flyable {
    override fun swim() {
        println("Утка летает")
    }

    override fun fly() {
        println("Утка плавает")
    }
}

fun main() {
    val crucianCarp = CrucianCarp()
    val seagull = Seagull()
    val duck = Duck()

    crucianCarp.swim()
    seagull.fly()
    seagull.swim()
    duck.fly()
    duck.swim()
}