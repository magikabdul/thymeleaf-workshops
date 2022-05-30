package cloud.cholewa.thymeleafworkshops.books.adapters.persistence;

import cloud.cholewa.thymeleafworkshops.books.domain.BookDomain;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface JpaBookMapper {

    BookDomain toDomain(BookEntity bookEntity);

    @Mapping(target = "id", ignore = true)
    BookEntity toEntity(BookDomain bookDomain);

    @IterableMapping(elementTargetType = BookDomain.class)
    List<BookDomain> toDomain(List<BookEntity> booksEntities);
}
