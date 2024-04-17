package com.example.Library.Reposatorie;

import com.example.Library.Entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
     @Override
     Page<Book> findAll(Pageable pageable);
}
