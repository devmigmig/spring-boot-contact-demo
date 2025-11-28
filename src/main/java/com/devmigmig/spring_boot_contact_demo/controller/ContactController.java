package com.devmigmig.spring_boot_contact_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.devmigmig.spring_boot_contact_demo.pojo.Contact;
import com.devmigmig.spring_boot_contact_demo.service.ContactService;


@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    public ResponseEntity<List<Contact>> getContacts(){
        List<Contact> contacts = contactService.getContacts();
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }
}
