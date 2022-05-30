package cloud.cholewa.thymeleafworkshops.books.adapters.web;

import cloud.cholewa.thymeleafworkshops.books.ports.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("books")
@Controller
@RequiredArgsConstructor
public class BookWebController {

    private final BookService bookService;

    @GetMapping
    public String showBooks(Model model) {
        var books = bookService.findAll();
        model.addAttribute("booksList", books);

        return "books/books-list";
    }
}
