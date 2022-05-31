package cloud.cholewa.thymeleafworkshops.books.ports;

import cloud.cholewa.thymeleafworkshops.books.domain.BookDomain;
import cloud.cholewa.thymeleafworkshops.books.domain.BookDomainRequest;

import java.util.List;

public interface BookService {

    List<BookDomain> findAll();

    BookDomain save(BookDomainRequest bookDomainRequest);
}
