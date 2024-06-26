package com.example.Library.Controller;

import com.example.Library.DTO.pageParametersDTO;
import com.example.Library.Entity.Book;
import com.example.Library.Service.BookService;
import com.example.Library.SystemUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("books")
public class BookController {

    BookService service;

    @Autowired
    BookController(BookService service){
        this.service=service;
    }

    @GetMapping
    public Page<Book> getBooks(@ModelAttribute pageParametersDTO page){
        return service.findAll(SystemUtil.CreatePage(page));
    }
    @GetMapping("/{id}")
    public Book getBooks(@PathVariable long ID){
        return service.getBook(ID);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable long ID){
         service.delete(ID);
    }

    @PostMapping
    public Book createBook(@RequestParam Book book){
        return service.save(book);
    }

}
