package domain

import java.time.LocalDateTime

class Publication(val title: String, val message: String, val author: User) {

    val date: LocalDateTime = LocalDateTime.now()
    private var viewCount: Int = 0
    private val comments: MutableList<Comment> = mutableListOf()
    private val followers: MutableList<User> = mutableListOf()

    fun increaseViewCount(increaseValue: Int) {
        viewCount += increaseValue
    }

    fun getViewCount(): Int {
        return viewCount
    }

    fun addComent(author: User, message: String) {
        comments.add(Comment(author, message))
    }

    fun getComments(): List<Comment> {
        return comments
    }

    fun addFollower(follower: User) {
        followers.add(follower)
    }

    fun getFollowers(): List<User> {
        return followers
    }

}