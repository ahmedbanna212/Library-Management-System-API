package com.example.Library.Controller;

import com.example.Library.DTO.pageParametersDTO;
import com.example.Library.Entity.Book;
import com.example.Library.Entity.Patron;
import com.example.Library.Service.PatronService;
import com.example.Library.SystemUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("patrons")
public class PatronController {


    PatronService service;

    @Autowired
    PatronController(PatronService service){
        this.service=service;
    }

    @GetMapping
    public Page<Patron> getPatrons(@ModelAttribute pageParametersDTO page){
        return service.findAll(SystemUtil.CreatePage(page));
    }

    @GetMapping("/{id}")
    public Patron getPatron(@PathVariable long ID){
        return service.getPatron(ID);
    }

    @DeleteMapping("/{id}")
    public void deletePatron(@PathVariable long ID){
        service.delete(ID);
    }

    @PostMapping
    public Patron createPatron(@RequestParam Patron Patron){
        return service.save(Patron);
    }

}
