package org.example.lesson_19

enum class Gender(val gender: String) {
    MALE("Мужчина"),
    FEMALE("Женщина");

    companion object {
        fun findGenderName(name: String): Gender? {
           return Gender.entries.find { it.gender.equals(name, ignoreCase = true) }
        }
    }
}

class Person (
    val name: String,
    val gender: Gender,
)

fun main() {
    val peopleList: MutableList<Person> = mutableListOf()
    println("необходимо ввести данные $NUMBER_OF_PEOPLE человек")
    for (i in 1..NUMBER_OF_PEOPLE) {
        println("Ведите имя $i человека")
        val enterName = readln()
        var enterGender = ""

        do {
            println("Ведите пол $i человека. Пол должен быть ${Gender.MALE.gender} или ${Gender.FEMALE.gender}")
            enterGender = readln()
            if (Gender.findGenderName(enterGender) == null) println("Пол введен не верно!")
        } while (Gender.findGenderName(enterGender) == null)

        peopleList.add(Person(enterName, Gender.findGenderName(enterGender)!!))
    }
    peopleList.forEach {
        println("Имя: ${it.name}. Пол: ${it.gender.gender}")
    }
}

private const val NUMBER_OF_PEOPLE = 5