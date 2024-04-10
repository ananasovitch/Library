package ananasovitch.org.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthorRequestTest {

    @Test
    public void testAuthorRequest() {
        AuthorRequest authorRequest = new AuthorRequest();
        authorRequest.setFirstName("John");
        authorRequest.setLastName("Doe");

        assertEquals("John", authorRequest.getFirstName());
        assertEquals("Doe", authorRequest.getLastName());
    }
}