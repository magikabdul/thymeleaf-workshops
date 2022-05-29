package cloud.cholewa.thymeleafworkshops.books.ports;

import cloud.cholewa.thymeleafworkshops.books.domain.BookDomain;

import java.util.List;
import java.util.Optional;

public interface BookRepository {

    BookDomain save(BookDomain bookDomain);

    Optional<BookDomain> getById(Long id);

    List<BookDomain> getAll();
}
