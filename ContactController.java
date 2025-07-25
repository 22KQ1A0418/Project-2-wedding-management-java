package com.wedding.controller;

import com.wedding.entity.Contact;
import com.wedding.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin
public class ContactController {

    @Autowired
    private ContactService service;

    @PostMapping
    public Contact save(@RequestBody Contact contact) {
        return service.save(contact);
    }
}
