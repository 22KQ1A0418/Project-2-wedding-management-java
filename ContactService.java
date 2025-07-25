package com.wedding.service;

import com.wedding.entity.Contact;
import com.wedding.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    @Autowired
    private ContactRepository repo;

    public Contact save(Contact contact) {
        return repo.save(contact);
    }
}
