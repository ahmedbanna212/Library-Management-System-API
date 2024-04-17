package com.example.Library.Controller;

import com.example.Library.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("books")
public class BookController {

    BookService service;

    @Autowired
    BookController(BookService service){
        this.service=service;
    }
}
