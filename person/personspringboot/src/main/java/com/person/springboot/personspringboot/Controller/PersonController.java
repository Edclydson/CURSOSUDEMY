package com.person.springboot.personspringboot.Controller;

import java.util.List;

import com.person.springboot.personspringboot.Model.Person;
import com.person.springboot.personspringboot.Services.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService Service;

    @RequestMapping(value = "/{id}",
                    method = RequestMethod.GET,
                    produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable("id") String id)
    {
        return Service.findById(id);
    }
    @RequestMapping(method = RequestMethod.GET,
                    produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findAll()
    {
    return Service.findAll();
    }
}
