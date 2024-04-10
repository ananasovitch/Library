package ananasovitch.org.library.repository;


import ananasovitch.org.library.AuthorEntity;

public class AuthorRepository {
    public AuthorEntity findAuthorById(Long id) {
        //    поиск автора по id
        // получение автора из базы данных
        return new AuthorEntity();
    }

    public void saveAuthor(AuthorEntity author) {
        //    сохранение автора
        //  сохранение автора в базу данных
        author.setId(1L); //   id для примера
    }
}
