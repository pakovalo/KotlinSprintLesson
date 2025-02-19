package org.example.lesson_11

data class ForumMember(
    val userId: Int,
    val userName: String,
)

data class ForumMessage(
    val authorId: Int,
    val message: String,
)

class Forum {
    val usersList= mutableListOf<ForumMember>()
    val messages: MutableList<ForumMessage> = mutableListOf()
    var counterUserId = 1

    fun createNewUser(userName: String): ForumMember {
        val newUser = ForumMember(counterUserId, userName)
        usersList.add(newUser)
        counterUserId++
        return newUser
    }
    fun createNewMessage (authorId: Int, message: String): ForumMessage? {
        val author = usersList.find { it.userId == authorId }
        return if (author != null) {
            val newMessage = ForumMessage(authorId, message)
            messages.add(newMessage)
            newMessage
        } else null
    }

    fun printThread () {
        messages.forEach { message ->
            val author = usersList.find { it.userId == message.authorId }
            println("${author?.userName}: ${message.message}")
        }
    }
}





fun main(){

    val forum = Forum()

    val user1 = forum.createNewUser("Вера")
    val user2 = forum.createNewUser("Александр")

    forum.createNewMessage(user1.userId, "Всем привет!")
    forum.createNewMessage(user2.userId, "Привет,Вера.")
    forum.createNewMessage(user1.userId, "Чем занимаешься?")
    forum.createNewMessage(user2.userId, "Читаю книгу.")

    forum.printThread()
}