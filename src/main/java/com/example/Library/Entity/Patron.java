package com.example.Library.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patron {
    private long ID;
    private String name;
    private String phoneNumber;
    private String mail;
    
}
