package com.example.Library.Reposatorie;

import com.example.Library.Entity.Patron;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatronRepository extends JpaRepository<Patron,Long> {
    @Override
    Page<Patron> findAll(Pageable page);
}
