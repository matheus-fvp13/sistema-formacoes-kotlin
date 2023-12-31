package domain

import domain.enumeration.Level
import java.time.Duration

class Lesson (title: String, duration: Duration, level: Level, instructor: User, val videoUrl: String) :
        Content(title = title, duration = duration, level = level, instructor = instructor) {
    override fun toString(): String {
        return "Lesson(title=${title}, duration= ${duration.toHours()}, level=$level, videoUrl='$videoUrl, instrutor=${instructor.name}')"
    }
}