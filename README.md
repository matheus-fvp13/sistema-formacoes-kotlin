# Sistema de formações em Kotlin

# Sobre o projeto

# Diagrama de classes

```mermaid
classDiagram
    class User {
        -name: String
        -email: String 
        -level: Int
        -reputation: Int
    }
    class EducationalContent {
        -title: String
        -duration: Duration
        -description: String
        -level: Level
        -courses: List~Course~
        -enrolledUsers: List~User~
        -forum: Forum
    }
    class Course {
        -title: String
        -duration: Duration
        -level: Level
        -lessons: List~Lesson~
        -instructor: User
    }
    class Lesson {
        -title: String
        -duration: Duration
        -videoUrl: String
    }
    class Forum {
        -publications: List~Publication~
    }
    class Publication {
        -title: String
        -date: LocalDateTime
        -content: String
        -viewCount: Int
        -author: User
        -comments: List~Comment~
        -followers: List~User~
    }
    class Comment {
        -author: User
        -content: String
    }
    class Level {
        <<enumeration>>
        BASIC
        INTERMEDIATE
        ADVANCED
    }

    User "n"--o"n" EducationalContent : participates
    EducationalContent "n"o--"1..n" Course
    Course "1"*--"1..n" Lesson
    Course -- Level
    EducationalContent "1"*--"1" Forum
    Forum "1"*--"n" Publication
    Publication "n"o--"1" User : follows
    Publication "1"*--"n" Comment
    Comment "n"--"1" User : makes
    Publication "n"o--"n" User : publishes
    EducationalContent -- Level
   
```

# Tecnologias utilizadas

# Como executar o projeto

# Autor
Matheus Fernando Vieira Pinto.

https://www.linkedin.com/in/matheus-fvp/