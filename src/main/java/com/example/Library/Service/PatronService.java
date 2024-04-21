package com.example.Library.Service;

import com.example.Library.Entity.Patron;
import com.example.Library.Reposatorie.PatronRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PatronService {

    PatronRepository repository;

    @Autowired
    PatronService(PatronRepository repository){
        this.repository=repository;
    }

    public Patron save(Patron patron){
        return repository.save(patron);
    }

    public Page<Patron> findAll(Pageable page){
        return repository.findAll(page);
    }

    public Patron getPatron(long id){
        return repository.findById(id).get();
    }

    public void delete(long id){
        Patron patron=repository.findById(id).get();
        repository.delete(patron);
    }
}
