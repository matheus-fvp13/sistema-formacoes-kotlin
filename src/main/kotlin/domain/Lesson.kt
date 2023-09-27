package domain

import java.time.Duration

data class Lesson (val title: String, val duration: Duration, val videoUrl: String, val teacher: User)