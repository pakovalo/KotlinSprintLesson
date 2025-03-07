package org.example.lesson_20

class Robot {
    val phrases = listOf(
        "Доброе утро, хозяин!",
        "Привет, я робот!",
        "Чем я могу Вам помочь?",
        "Что мне для Вас сделать?",
        "Вы куда-то собираетесь?"
    )
    companion object {
        private var modifier: (String) -> String = { it }
        fun say(phrase: String) {
            println(modifier(phrase))
        }
        fun newModifier(mod: (String) -> String) {
            modifier = mod
        }
    }
}

fun main() {
    val randomPhrase = Robot().phrases.random()
    Robot.say(randomPhrase)
    Robot.newModifier {
        phrase -> phrase.split(" ").reversed().joinToString(" ")
    }
    Robot.say(randomPhrase)
}