package domain

import domain.enumeration.Level
import java.time.Duration

class Course (title: String, duration: Duration, level: Level, instructor: User)
    : Content(title = title, duration = duration, level = level, instructor = instructor) {

    private val lessons: MutableList<Lesson>  = mutableListOf()

    fun addLesson(lesson: Lesson): Boolean {
        if(lesson.instructor != instructor) {
            return false
        }
        lessons.add(lesson)
        return true
    }

    fun getLessons() : List<Lesson> {
        return lessons
    }

}