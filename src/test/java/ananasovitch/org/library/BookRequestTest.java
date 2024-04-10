package ananasovitch.org.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookRequestTest {

    @Test
    public void testAuthorRequest() {
        BookRequest bookRequest = new BookRequest();
        bookRequest.setTitle("Sample Book");
        bookRequest.setAuthorId(1L);

        assertEquals("Sample Book", bookRequest.getTitle());
        assertEquals(1L, bookRequest.getAuthorId());
    }
}