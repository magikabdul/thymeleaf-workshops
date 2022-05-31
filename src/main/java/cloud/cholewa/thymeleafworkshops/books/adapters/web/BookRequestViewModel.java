package cloud.cholewa.thymeleafworkshops.books.adapters.web;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class BookRequestViewModel {

    @NotEmpty
    @Size(min = 5)
    private String author;

    @NotEmpty
    @Size(min = 5)
    private String title;

    @NotEmpty
    @Size(min = 5)
    private String genre;

    @NotEmpty
    @Size(min = 5)
    private String publisher;
}
