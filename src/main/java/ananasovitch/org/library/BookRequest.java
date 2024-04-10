package ananasovitch.org.library;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookRequest {
    private String title;
    private Long authorId;
}


