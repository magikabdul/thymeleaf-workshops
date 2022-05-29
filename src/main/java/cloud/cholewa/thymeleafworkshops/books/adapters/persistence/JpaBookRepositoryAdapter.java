package cloud.cholewa.thymeleafworkshops.books.adapters.persistence;

import cloud.cholewa.thymeleafworkshops.books.domain.BookDomain;
import cloud.cholewa.thymeleafworkshops.books.ports.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Component
@Transactional
@RequiredArgsConstructor
public class JpaBookRepositoryAdapter implements BookRepository {

    private final JpaBookRepository bookRepository;
    private final JpaBookMapper bookMapper;

    @Override
    public BookDomain save(BookDomain bookDomain) {
        var bookEntity = bookMapper.toEntity(bookDomain);
        var savedBook = bookRepository.save(bookEntity);

        return bookMapper.toDomain(savedBook);
    }

    @Override
    public Optional<BookDomain> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<BookDomain> getAll() {
        return null;
    }
}
