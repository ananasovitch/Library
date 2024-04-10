package ananasovitch.org.library;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthorResponse {
    private Long id;
    private String firstName;
    private String lastName;
}
