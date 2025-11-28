package com.devmigmig.spring_boot_contact_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.devmigmig.spring_boot_contact_demo.pojo.Contact;
import com.devmigmig.spring_boot_contact_demo.service.ContactService;


@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping(value = "/contact/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Contact>> getContacts(){
        List<Contact> contacts = contactService.getContacts();
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping(value = "/contact/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Contact> getContact(@PathVariable String id){
        Contact contact = contactService.getContactById(id);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }
    
}
