package org.example.lesson_20

fun main() {
    val username = "Миша"
    val greeting: (String) -> String = { "С наступающим Новым Годом, $username!" }
    println(greeting(username))
}