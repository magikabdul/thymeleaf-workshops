package cloud.cholewa.thymeleafworkshops.books.adapters.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaBookRepository extends JpaRepository<BookEntity, Long> {
}
