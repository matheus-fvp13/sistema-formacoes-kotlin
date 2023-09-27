package application

import domain.*

fun main() {

    val user1: User = User("Matheus Vieira", "matheus@gmail.com")
    val user2: User = User("Melissa Santos", "melissa@gmail.com")
    val user3: User = User("Pricila Oliveira", "pricila@gmail.com")

    /*val lesson1 = Lesson("Introduçao ao Python", Duration.ofMinutes(30L), Level.BASIC, user2, "url1")
    val lesson2 = Lesson("HTML e CSS - Flex box", Duration.ofMinutes(50L), Level.INTERMEDIATE, user3,"url2")
    val lesson3 = Lesson("Java - Collections", Duration.ofHours(2L), Level.INTERMEDIATE, user1,"url3")

    val course1 = Course("Java Intermediario", Duration.ofHours(30), Level.INTERMEDIATE, user1)

    if(course1.addLesson(lesson3)) {
        println("Mesmo professor")
    }else {
        println("Professores diferentes")
    }

    println(course1.getLessons())*/


    val publication = Publication("Duvidas em css", "Duvida no tópico abc", user3)
    publication.addComent(user2, "Solução 1")
    publication.addFollower(user2)
    publication.addFollower(user1)
    for(follower in publication.getFollowers()) println(follower)

    val forum = Forum()
    forum.addPublication("Duvidas em css", "Duvida no tópico abc", user3)
    println(forum.getPublications()[0].addFollower(user1))
    println(forum.getPublications()[0].getFollowers())

}