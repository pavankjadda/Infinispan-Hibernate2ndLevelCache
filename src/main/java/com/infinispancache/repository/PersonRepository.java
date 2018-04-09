package com.infinispancache.repository;

import com.infinispancache.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface PersonRepository extends CrudRepository<Person, Long>
{

}
