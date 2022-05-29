package cloud.cholewa.thymeleafworkshops.books.adapters.persistence;

import cloud.cholewa.thymeleafworkshops.books.domain.BookDomain;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface JpaBookMapper {

    BookDomain toDomain(BookEntity bookEntity);

    BookEntity toEntity(BookDomain bookDomain);

    @IterableMapping(elementTargetType = BookDomain.class)
    List<BookDomain> toDomain(List<BookEntity> booksEntities);
}
