package com.coderscampus.Unit14.web;


import com.coderscampus.Unit14.dto.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @PostMapping("/persons")
    public Person createPerson(@RequestParam String name, @RequestParam Integer age, @RequestParam(required = false) String gender) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        return person;
    }
}
