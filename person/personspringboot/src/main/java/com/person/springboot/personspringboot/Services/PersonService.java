package com.person.springboot.personspringboot.Services;

import java.util.concurrent.atomic.AtomicLong;

import com.person.springboot.personspringboot.Model.Person;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private AtomicLong counter = new AtomicLong();

    public Person findById(String id)
    {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Edclydson");
        person.setLasttName("Sousa");
        person.setAdress("Fortaleza - Ceara - Brasil");
        person.setGender("Male");
        return person;
    }
}
