package com.infinispancache.web;

import com.infinispancache.model.Person;
import com.infinispancache.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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



    @PostMapping(value = "/person")
    public Person updatePerson(@RequestBody   Person person)
    {
        return personRepository.save(person);
    }

    @PutMapping(value = "/person")
    public Person createPerson(@RequestBody   Person person)
    {
        return personRepository.save(person);
    }

}
