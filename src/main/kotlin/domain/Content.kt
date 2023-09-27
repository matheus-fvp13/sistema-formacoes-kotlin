package domain

import domain.enumeration.Level
import java.time.Duration

open class Content(val title: String, val duration: Duration, val level: Level, val instructor: User)