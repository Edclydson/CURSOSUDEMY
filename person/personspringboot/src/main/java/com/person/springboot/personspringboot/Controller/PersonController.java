package com.person.springboot.personspringboot.Controller;

import java.util.List;

import com.person.springboot.personspringboot.Model.Person;
import com.person.springboot.personspringboot.Services.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService Service;

    // ENCONTRANDO PERSON PELO ID RETORNANDO VIA PATH
    @RequestMapping(value = "/{id}",
                    method = RequestMethod.GET,
                    produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable("id") String id)
    {
        return Service.findById(id);
    }
    /// ENCONTRANDO LISTA DE PERSONS RETORNANDO VIA PATH
    @RequestMapping(method = RequestMethod.GET,
                    produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findAll()
    {
    return Service.findAll();
    }
    /// CRIANDO PERSON P PERSISTIR (POST) VIA BODY 
    @RequestMapping(method = RequestMethod.POST,
                    consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE,
                    produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public Person create(@RequestBody Person person)
    {
        return Service.create(person);
    }
    /// ATUALIZANDO PERSON (PUT) VIA BODY 
    @RequestMapping(method = RequestMethod.PUT,
                    consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE,
                    produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public Person update(@RequestBody Person person)
    {
        return Service.update(person);
    }
    /// DELETANDO PERSON (POST) VIA BODY 
    @RequestMapping(value = "/{id}",
                    method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id)
    {
        Service.delete(id);
    }
}
