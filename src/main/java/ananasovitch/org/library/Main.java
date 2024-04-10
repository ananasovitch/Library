package ananasovitch.org.library;

import ananasovitch.org.library.repository.AuthorRepository;

public class Main {
    public static void main(String[] args) {
        // объект AuthorRepository
        AuthorRepository authorRepository = new AuthorRepository();

        // Находим автора по id и выводим его имя и фамилию
        AuthorEntity foundAuthor = authorRepository.findAuthorById(1L);
        System.out.println("Found author: " + foundAuthor.getFirstName() + " " + foundAuthor.getLastName());

        // Сохраняем нового автора и выводим его id
        AuthorEntity newAuthor = new AuthorEntity();
        authorRepository.saveAuthor(newAuthor);
        System.out.println("New author saved with id: " + newAuthor.getId());
    }
}
