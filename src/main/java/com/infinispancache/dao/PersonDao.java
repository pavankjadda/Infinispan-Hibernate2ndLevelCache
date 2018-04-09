package com.infinispancache.dao;

import com.infinispancache.model.Person;
import com.infinispancache.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;

@Repository
public class PersonDao
{
    @Autowired
    PersonRepository personRepository;

    public Optional<Person> getPersonById(Long    id)
    {
        Optional<Person> personIterable=personRepository.findById(id);
        return personIterable;
    }

    public Iterable<Person> findAll()
    {
        return personRepository.findAll();
    }

    public Person save(Person person)
    {
        return personRepository.save(person);
    }
}
