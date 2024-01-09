package com.coderscampus.Unit14.web;


import com.coderscampus.Unit14.dto.Person;
import com.coderscampus.Unit14.repository.PersonRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    // Controllers are normally PLURALIZED
    // PersonController is pluralized from `person` to `persons`

    private PersonRepository personRepo;


    public PersonController(PersonRepository personRepo) {
        this.personRepo = personRepo;

    }


    @PostMapping("/persons")
    public Person createPerson(Long id, String name, Integer age, String gender) {
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        personRepo.save(person);
        return person;
    }
    // Fetches the person with ID 1
    // http://localhost:8080/persons/1
    @GetMapping("/persons/{personId}")
    public Person getPerson(@PathVariable Long personId) {
        System.out.println("personId: " + personId);
        return personRepo.findById(personId);
    }
}
