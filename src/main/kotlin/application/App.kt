package application

import domain.Course
import domain.Lesson
import domain.User
import domain.enumeration.Level
import java.time.Duration

fun main() {

    val user1: User = User("Matheus Vieira", "matheus@gmail.com")
    val user2: User = User("Melissa Santos", "melissa@gmail.com")
    val user3: User = User("Pricila Oliveira", "pricila@gmail.com")

    val lesson1 = Lesson("Introduçao ao Python", Duration.ofMinutes(30L), "url1", user2)
    val lesson2 = Lesson("HTML e CSS - Flex box", Duration.ofMinutes(50L), "url2", user3)
    val lesson3 = Lesson("Java - Collections", Duration.ofHours(2L), "url3", user1)

    val course1 = Course("Java Intermediario", Duration.ofHours(30), Level.INTERMEDIATE, user1)

    if(course1.addLesson(lesson3)) {
        println("Mesmo professor")
    }else {
        println("Professores diferentes")
    }

    println(course1.getLessons())

}