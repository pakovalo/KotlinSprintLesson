package org.example.lesson_18

abstract class Animal (
    val name: String
) {
    abstract fun eat()

    fun sleep() {
        println("[$name] -> спит")
    }

}
class Dog(
    name: String
): Animal(name) {
    override fun eat() {
        println("[$name] -> ест кости")
    }
}

class Fox(
    name: String
): Animal(name) {
    override fun eat() {
        println("[$name] -> ест ягоды")
    }
}

class Cat(
    name: String
): Animal(name) {
    override fun eat() {
        println("[$name] -> ест рыбу")
    }
}

fun main() {
    val cat = Cat("Кошка")
    val dog = Dog("Собака")
    val fox = Fox("Лиса")

    val listAnimals: List<Animal> = listOf(cat, dog, fox)

    for (i in listAnimals){
        i.eat()
        i.sleep()
    }
}