package cloud.cholewa.thymeleafworkshops.books;

import cloud.cholewa.thymeleafworkshops.books.domain.BookServiceImpl;
import cloud.cholewa.thymeleafworkshops.books.ports.BookRepository;
import cloud.cholewa.thymeleafworkshops.books.ports.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfiguration {

    @Bean
    public BookService getService(BookRepository bookRepository) {
        return new BookServiceImpl(bookRepository);
    }
}
