package com.commverge.kafka.service.impl;

import com.commverge.kafka.domain.Person;
import com.commverge.kafka.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonServiceImpl implements PersonService {
    @Autowired
    private Person person;

    @Override
    public Person getPersonInfo() {
        return person;
    }
}
