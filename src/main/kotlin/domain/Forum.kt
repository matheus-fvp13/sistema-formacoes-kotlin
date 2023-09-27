package domain

import java.time.LocalDateTime

class Forum {

    private val publications = mutableListOf<Publication>()

    fun addPublication(title: String, message: String, author: User) {
        publications.add(Publication(title = title, message = message, author = author))
    }

    fun getPublications(): List<Publication> {
        return publications
    }

}