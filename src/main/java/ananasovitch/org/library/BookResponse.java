package ananasovitch.org.library;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookResponse {
    private Long id;
    private String title;
    private Long authorId;
}
