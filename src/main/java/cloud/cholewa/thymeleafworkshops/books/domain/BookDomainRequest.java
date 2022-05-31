package cloud.cholewa.thymeleafworkshops.books.domain;

import lombok.Data;

@Data
public class BookDomainRequest {

    private String author;
    private String title;
    private String genre;
    private String publisher;
}
