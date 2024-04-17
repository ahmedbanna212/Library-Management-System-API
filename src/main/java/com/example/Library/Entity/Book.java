package com.example.Library.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private long ID;
    private String title;
    private String author;
    private String ISBN;
    private Date publicationYear;


}
