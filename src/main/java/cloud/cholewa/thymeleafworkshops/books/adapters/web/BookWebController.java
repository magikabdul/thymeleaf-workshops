package cloud.cholewa.thymeleafworkshops.books.adapters.web;

import cloud.cholewa.thymeleafworkshops.books.ports.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@RequestMapping("books")
@Controller
@RequiredArgsConstructor
public class BookWebController {

    private final BookService bookService;
    private final BookWebMapper bookWebMapper;

    @GetMapping
    public String showBooks(Model model) {
        var books = bookService.findAll();
        model.addAttribute("booksList", books);

        return "books/books-list";
    }

    @GetMapping("add")
    public String showFormAddBook(Model model) {
        model.addAttribute("addBook", new BookRequestViewModel());
        return "books/books-add";
    }

    @PostMapping("add")
    public String addBook(@Valid @ModelAttribute("addBook") BookRequestViewModel viewModel,
                          BindingResult bindingResult,
                          RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return "books/books-add";
        }

        var bookRequest = bookWebMapper.toDomain(viewModel);
        var bookDomain = bookService.save(bookRequest);

        return "redirect:/books";
    }
}
