package com.coderscampus.Unit14;

import com.coderscampus.Unit14.dto.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class JsonExample {

    /**
     *? JSON
     * ? JavaScript Object Notation
     * ? A simple String based way to notate data
     ** - Key : Value pairs
     *!   - Key : Value pairs are seperated by commas
     *!   - Objects are represented by curly brackets {}
     *!   - Arrays are represented by square brackets []
     *
     *? Important note: JSON is not tied to JavaScript... it is
     *?   language agnostic (meaning it'll work in any language)
     *
     ** JSON is just data passed around on the internet.
     ** From client to server then from server to client.
     ** It is the accepted way of passing data back-and-fourth from client to server.
     ** Or from one language to another via an API Endpoint
     *
     *? Person: name, age, gender (Java object)
     *! JSON example of Person
     *? {
     *?     "name"    : "Trevor Page",
     *?      "age"    : 37,
     *?      "gender" : "Male"
     *? }
     *
     *! Remember List is just an Array
     *
     *? List<Person> people
     *! JSON example of List<Person> people
     *? [
     *?  {
     *?      "name"   : "Trevor Page",
     *?      "age"    : 37,
     *?      "gender" : "Male"
     *?  },
     *?  {
     *?      "name"   : "Jane Doe",
     *?      "age"    : 40,
     *?      "gender" : "Female"
     *?  }
     *? ]
     */
@Test
    public void convertJsonStringToJavaObject() {
        // 1. Get String; normally from the internet
        // 2. Receive that String
        String jsonString = "{\"name\" : \"Trevor Page\", \"age\" : 37, \"gender\" : \"Male\"}";

        // 3. Turn String into Java Object
        ObjectMapper mapper = new ObjectMapper();
        try {
            Person person = mapper.readValue(jsonString, Person.class);
            // 4. Modify Java Object with Java code
            System.out.println(person);
            System.out.println(person.getName());
            System.out.println(person.getAge());
            person.setAge(person.getAge()+1);
            System.out.println(person.getAge());
            System.out.println(person.getGender());

            // 5. Convert back to JSON String, so we can send it back through
            // the internet to another HTML page
            System.out.println(mapper.writeValueAsString(person));

            // 6. In the world of HTML we can do something with that JSON.


        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }


}
