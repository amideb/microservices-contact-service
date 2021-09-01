package com.debrup.microservicescontactservice.controller;


import com.debrup.microservicescontactservice.entity.Contact;
import com.debrup.microservicescontactservice.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("user//{userId}")
    public List<Contact> getContacts(@PathVariable("userId") Long userId){
        return contactService.getContactsOfUser(userId);
    }
}
