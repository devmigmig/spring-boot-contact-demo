package com.devmigmig.spring_boot_contact_demo.service;

import java.util.List;

import com.devmigmig.spring_boot_contact_demo.pojo.Contact;

public interface ContactService {
    Contact getContactById(String id);
    void saveContact(Contact contact);
    List<Contact> getContacts();
}
