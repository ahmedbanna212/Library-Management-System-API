package com.example.Library.Service;

import com.example.Library.Entity.Book;
import com.example.Library.Reposatorie.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    BookRepository repository;

    @Autowired
    BookService(BookRepository repository){
        this.repository=repository;
    }

    public Page<Book> findAll(Pageable page){

        return repository.findAll(page);

    }
}
