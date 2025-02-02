package org.example.lesson_2

fun main () {

    val numberOfEmployees = 50
    val salaryEmployees = 30000
    val numbersOfIntern = 30
    val salaryIntern = 20000

    val totalSalaryOfEmployees = numberOfEmployees * salaryEmployees
    val totalSalaryOfIntern = numbersOfIntern * salaryIntern
    val allSalary = totalSalaryOfIntern + totalSalaryOfEmployees
    val allEmployees = numberOfEmployees + numbersOfIntern
    val averageSalary = allSalary / allEmployees

    println("Расходы на постоянных сотрудников: $totalSalaryOfEmployees")
    println("Расходы на заработную плату всего: $allSalary")
    println("Средняя заработная плата: $averageSalary")

}