package com.infinispancache.web;

import com.infinispancache.model.Person;
import com.infinispancache.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class PersonController
{
    @Autowired
    PersonRepository    personRepository;

    @GetMapping(value = "/person/all")
    public List<Person> getPersons()
    {
        Iterable<Person>    personIterable=personRepository.findAll();
        List<Person>    personList=new ArrayList<>();
        personIterable.forEach(personList::add);
        return personList;
    }
    @GetMapping(value = "/person/{id}")
    public Optional<Person> getPersonById(@PathVariable Long    id)
    {
        Optional<Person> personIterable=personRepository.findById(id);
        return personIterable;
    }

}
