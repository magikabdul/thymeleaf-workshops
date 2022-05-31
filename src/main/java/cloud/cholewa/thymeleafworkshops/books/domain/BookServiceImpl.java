package cloud.cholewa.thymeleafworkshops.books.domain;

import cloud.cholewa.thymeleafworkshops.books.ports.BookRepository;
import cloud.cholewa.thymeleafworkshops.books.ports.BookService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<BookDomain> findAll() {
        return bookRepository.getAll();
    }

    @Override
    public BookDomain save(BookDomainRequest bookDomainRequest) {
        return bookRepository.save(new BookDomain(bookDomainRequest.getAuthor(), bookDomainRequest.getTitle(), bookDomainRequest.getGenre(), bookDomainRequest.getPublisher()));
    }


}
