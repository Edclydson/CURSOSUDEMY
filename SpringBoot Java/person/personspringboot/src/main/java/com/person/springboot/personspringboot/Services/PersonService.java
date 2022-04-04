package com.person.springboot.personspringboot.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.person.springboot.personspringboot.Model.Person;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private AtomicLong counter = new AtomicLong();

    public Person create(Person person)
    {
        return person;
    }
    public Person update(Person person)
    {
        return person;
    }
    public void delete(String id)
    {
        
    }

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
    public List<Person> findAll()
    {
        List<Person> persons = new ArrayList<Person>();
        for(int i = 0; i <= 8; i++)
        {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }
    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person Name" +i);
        person.setLasttName("LastName" +i);
        person.setAdress("Some in Brasil" +i);
        person.setGender("Male");
        return person;
    }
    public List<Person> findAll(String id) {
        return null;
    }
}
