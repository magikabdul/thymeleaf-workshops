package cloud.cholewa.thymeleafworkshops.books.adapters.web;

import cloud.cholewa.thymeleafworkshops.books.domain.BookDomain;
import cloud.cholewa.thymeleafworkshops.books.domain.BookDomainRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookWebMapper {

    BookDomainRequest toDomain(BookRequestViewModel viewModel);

    BookViewModel toViewModel(BookDomain bookDomain);
}
