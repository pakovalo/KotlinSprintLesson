package org.example.lesson_14

open class Message (
    val id: Int,
    val author: String,
    val text: String,
) {
    open fun printMessage(){
        println("($author): $text")
    }
}

class ChildMessage (
    id: Int,
    author: String,
    text: String,
    val parentMessageId: Int,
) : Message(
    id = id,
    author = author,
    text = text,
) {
    override fun printMessage() {
        println("\t(${author}): $text")
    }
}
class Chat(
    var messageCounter: Int = 1,
    val messages: MutableList<Message> = mutableListOf(),
) {
    fun addMessage(author: String, text: String) {
        messages.add(Message(messageCounter++, author = author, text = text))
    }

    fun addThreadMessage(author: String, text: String, parentMessageId: Int) {
        messages.add(ChildMessage(messageCounter++, author = author, text = text, parentMessageId = parentMessageId))
    }

    fun printChat() {
        val groupedMessages = messages.groupBy { (it as? ChildMessage)?.parentMessageId ?: it.id }

        groupedMessages.forEach {
                      it.value.forEach { it.printMessage() }
        }
    }
}
fun main() {

    val chat = Chat()

    chat.addMessage("Михаил", "Что делаете?")
    chat.addMessage("Катя", "Всем привет")
    chat.addThreadMessage("Дима", "Отдыхаем", 1)
    chat.addThreadMessage("Лена", "Кино смотрю", 1)
    chat.addMessage("Костя", "Привет народ!")
    chat.addThreadMessage("Дима", "А у тебя как?", 1)
    chat.printChat()
}