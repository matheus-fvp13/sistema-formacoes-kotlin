package domain

import domain.enumeration.Level
import java.time.Duration

class Course (val title: String, val duration: Duration, val level: Level, val instructor: User) {

    private val lessons: MutableList<Lesson>  = mutableListOf()

    fun addLesson(lesson: Lesson): Boolean {
        if(lesson.teacher != instructor) {
            return false
        }
        lessons.add(lesson)
        return true
    }

    fun getLessons() : List<Lesson> {
        return lessons
    }

}