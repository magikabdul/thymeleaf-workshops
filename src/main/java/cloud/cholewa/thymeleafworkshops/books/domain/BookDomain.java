package cloud.cholewa.thymeleafworkshops.books.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookDomain {

    private String author;
    private String title;
    private String genre;
    private String publisher;
}
