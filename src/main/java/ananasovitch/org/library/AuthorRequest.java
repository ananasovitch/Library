package ananasovitch.org.library;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthorRequest {
    private String firstName;
    private String lastName;
}
