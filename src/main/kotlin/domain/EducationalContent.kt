package domain

import domain.enumeration.Level
import java.time.Duration

class EducationalContent (title: String, duration: Duration, level: Level, instructor: User, val description: String)
    : Content(title = title, duration = duration, level = level, instructor = instructor) {

        val forum: Forum = Forum()
        private val courses: MutableList<Course> = mutableListOf()
        private val enrolledUsers: MutableList<User> = mutableListOf()

        fun getForum() : Forum {
            return forum
        }

        fun addCourse(course: Course) {
            courses.add(course)
        }

        fun addEnrolledUser(enrolledUser: User) {
            enrolledUsers.add(enrolledUser)
        }

        fun getCourses(): List<Course> {
            return courses
        }

        fun getEnrolledUsers(): List<User> {
            return enrolledUsers
        }

}