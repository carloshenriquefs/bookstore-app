## :construction: - Projeto Bookstore-App
- Livraria Online

##

## 📋 - Diagrama de Classes:

```mermaid
classDiagram
  class Book {
    -UUID id
    -String title
    -Publisher publisher
    -Set<Author> authors
    -Review review
  }

  class Author {
    -UUID id
    -String name
    -Set<Book> books
  }

  class Publisher {
    -UUID id
    -String name
    -Set<Book> books
  }

  class Review {
    -UUID id
    -String comment
    -Book book
  }

  Book "N" *-- "N" Author
  Book "1" *-- "N" Publisher
  Book "1" *-- "1" Review
```

##

### :game_die: - Spring Data JPA:

##

![springDataJpa drawio](https://github.com/carloshenriquefs/bookstore-app/assets/54969405/805c0d80-4036-4e05-a9d5-e128423e5ddf)

##

## 🛠 - Tecnologias:

As seguintes ferramentas foram usadas na construção do projeto:

- [Java](https://www.oracle.com/java/technologies/downloads/)
- [Maven]
- [Spring]
- [Postman]
- [Postgres]
