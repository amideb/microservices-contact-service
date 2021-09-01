package com.debrup.microservicescontactservice.service;

import com.debrup.microservicescontactservice.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    //fake list of contacts
    List<Contact> list= List.of(
            new Contact(1L, "anushka@gmail.com", "Anushka", 1111L),
            new Contact(1L, "sharma@gmail.com", "Harry", 1111L),
            new Contact(2L, "tom@gmail.com", "Tom", 1112L),
            new Contact(3L, "mohini@gmail.com", "Mohini", 1113L)

    );
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
