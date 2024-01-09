package com.coderscampus.Unit14.repository;

import com.coderscampus.Unit14.dto.Person;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PersonRepository {

    // This file is not really a repository
    // Normally a repository would be making a connection with a database and modifying the data

    private Map<Long, Person> personsData = new HashMap<>();

   public void save(Person person){
       personsData.put(person.getId(), person);
   }

   public Person findById(Long personId) {
       return personsData.get(personId);
   }
}
