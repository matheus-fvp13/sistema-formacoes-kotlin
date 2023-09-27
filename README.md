# Sistema de formações em Kotlin

# Sobre o projeto

# Diagrama de classes

```mermaid
classDiagram
    class Usuario {
        -nome: String
        -email: String 
        -nivel: Int
        -reputacao: Int
    }
    class ConteudoEducacional {
        -titulo: String
        -duracao: Duration
        -descricao: String
        -nivel: Nivel
        -cursos: List~Curso~
        -usuariosMatriculados: List~Usuario~
        -forum: Forum
    }
    class Curso {
        -titulo: String
        -duracao: Duration
        -nivel: Nivel
        -aulas: List~Aula~
        -instrutor: Usuario
    }
    class Aula {
        -titulo: String
        -duracao: Duration
        -urlVideo: String
    }
    class Forum {
        -publicacoes: List~Pubicacao~
    }
    class Publicacao {
        -titulo: String
        -data: LocalDateTime
        -conteudo: String
        -numeroVisualizacoes: Int
        -autor: Usuario
        -comentarios: List~Comentario~
        -seguidores: List~Usuario~
    }
    class Comentario {
        -autor: Usuario
        -conteudo: String
    }
    class Nivel {
        <<enumeration>>
        BASICO
        INTERMEDIARIO
        AVANCADO
    }

    Usuario "n"--o"n" ConteudoEducacional : participa
    ConteudoEducacional "n"o--"1..n" Curso
    Curso "1"*--"1..n" Aula
    Curso -- Nivel
    ConteudoEducacional "1"*--"1" Forum
    Forum "1"*--"n" Publicacao
    Publicacao "n"o--"1" Usuario : segue
    Publicacao "1"*--"n" Comentario
    Comentario "n"--"1" Usuario : faz
    Publicacao "n"o--"n" Usuario : publica
    ConteudoEducacional -- Nivel
   
```

# Tecnologias utilizadas

# Como executar o projeto

# Autor
Matheus Fernando Vieira Pinto.

https://www.linkedin.com/in/matheus-fvp/