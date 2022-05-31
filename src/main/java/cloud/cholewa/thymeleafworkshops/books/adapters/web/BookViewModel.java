package cloud.cholewa.thymeleafworkshops.books.adapters.web;

import lombok.Data;

@Data
public class BookViewModel {
    private String author;
    private String title;
    private String genre;
    private String publisher;
}
