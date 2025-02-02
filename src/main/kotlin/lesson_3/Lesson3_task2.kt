package org.example.lesson_3

fun main() {

    val name ="Татьяна"
    val patronymic = "Сергеевна"
    val surnameBefore = "Андреева"
    val surnameAfter = "Сидорова"
    val ageBefore = 20
    val ageAfter = 22
    val personalData = """
        $surnameBefore $name $patronymic, $ageBefore лет.
        $surnameAfter $name $patronymic, $ageAfter года.
    """.trimIndent()

    print(personalData)

}