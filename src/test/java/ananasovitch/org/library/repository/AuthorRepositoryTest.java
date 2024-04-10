package ananasovitch.org.library.repository;

import ananasovitch.org.library.AuthorEntity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AuthorRepositoryTest {

    @Test
    public void testFindAuthorById() {
        AuthorRepository authorRepository = new AuthorRepository();

        AuthorEntity author = authorRepository.findAuthorById(1L);

        assertEquals("John", author.getFirstName());
        assertEquals("Doe", author.getLastName());
    }

    @Test
    public void testSaveAuthor() {
        AuthorRepository authorRepository = new AuthorRepository();

        AuthorEntity author = new AuthorEntity();
        author.setFirstName("Jane");
        author.setLastName("Smith");
        authorRepository.saveAuthor(author);

        // Проверяем, что автор был сохранен успешно
        assertEquals(1, author.getId());
    }
}