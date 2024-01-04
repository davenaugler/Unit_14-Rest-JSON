package com.coderscampus.Unit14.web;


import com.coderscampus.Unit14.dto.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @PostMapping("/persons")
    public Person createPerson(String name, Integer age, String gender) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        return person;
    }
}
