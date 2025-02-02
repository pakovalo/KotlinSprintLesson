package org.example.lesson_3

fun main() {

    val moveInChess = "D2-D4;0"
    val from = moveInChess.substring(0,2)
    val to = moveInChess.substring(3,5)
    val move = moveInChess.substring(6)

    println("Откуда:$from")
    println("Куда:$to")
    print("Номер хода:$move")

}