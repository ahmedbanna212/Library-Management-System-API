package com.example.Library.Controller;

import com.example.Library.DTO.pageParametersDTO;
import com.example.Library.Entity.Book;
import com.example.Library.Service.BookService;
import com.example.Library.SystemUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
