package com.debrup.microservicescontactservice.service;

import com.debrup.microservicescontactservice.entity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactsOfUser(Long userId);
}
