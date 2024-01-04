# Unit_14-Rest-JSON

## 01 - JSON
- Created `JsonExample.java` and broke down how JSON looks and how it is structured.
- JSON is based on Key Value pairs
- Objects are represented by curly brackets `{}`
- Arrays are represented by square brackets `[]`

## 02 - Converting JSON Strings to Java and Back
- Downloading someone else's code. In this case it's within our Spring-Boot Maven project (Jackson databind).
- Task: Take a Java Object and convert it into a JSON String and then visa versa
   - Used [Jackson databind](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind) to perform the local lifecycle of a JSON String, modify the JSON, and ouput the JSON String

## 03 - Sending Data to Java via Post Request
- Learned to pass data from a web request, using Postman
- Doing it this way we sent `name`, `age`, and `gender` via Query Params through the ULR
- Doing this exposes our data
  - **Pros:** Quick and easy, stateless, and there's no need for session management
  - **Cons:** Security risks, data size limitations, caching issues, and unpleasant user experience 


## 04 - Omitting RequestParam Annotation