package org.example.lesson_3

fun main() {

    val name ="Татьяна"
    val patronymic = "Сергеевна"
    var surname = "Андреева"
    var age = 20
    var personalData = "$surname $name $patronymic, $age лет."

    println(personalData)

    surname = "Сидорова"
    age = 22
    personalData = "$surname $name $patronymic, $age года."

    print(personalData)

}