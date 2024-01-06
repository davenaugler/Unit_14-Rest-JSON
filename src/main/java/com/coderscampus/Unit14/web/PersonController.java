package com.coderscampus.Unit14.web;


import com.coderscampus.Unit14.dto.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    // Controllers are normally PLURALIZED
    // PersonController is pluralized from `person` to `persons`
    @PostMapping("/persons")
    public Person createPerson(String name, Integer age, String gender) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        return person;
    }
    // Fetches the person with ID 1
    // http://localhost:8080/persons/1
    @GetMapping("/persons/{personId}")
    public Person getPerson(@PathVariable Long personId) {
        System.out.println("personId: " + personId);
        return null;
    }
}
