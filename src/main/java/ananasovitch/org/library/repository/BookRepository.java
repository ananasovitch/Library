package ananasovitch.org.library.repository;

import ananasovitch.org.library.BookEntity;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private final List<BookEntity> books = new ArrayList<>();

    public void save(BookEntity book) {
        //  сохранение книги
        books.add(book); // добавить книгу в список или бд
    }

    public List<BookEntity> findBooksByAuthor(Long authorId) {
        //  поиск книг по id автора
        List<BookEntity> result = new ArrayList<>();
        for (BookEntity book : books) {
            if (book.getAuthorId().equals(authorId)) {
                result.add(book);
            }
        }
        return result;
    }
}
