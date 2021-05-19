# Backend_Liv2Train_Siddartha 

# Prerequisite:
### - Java 11
### - Maven 3.0+

# Setup 
```
Running Application From command line 
cd ./Backend_Liv2Train_Siddartha

Build your project :
mvn install

After build there is a target folder created 
cd target 
java -jar target/Backend_Liv2Train_Siddartha-0.0.1-SNAPSHOT.jar

Using IDE - Eclipse, IntelliJ
Import Project directly and run the application 
```

In order to test API you can use [PostMan](https://www.postman.com/ 'Postman'), [Insomnia](https://insomnia.rest/ 'Insomnia') or an Extension in VS code Like 
[REST Client](https://marketplace.visualstudio.com/items?itemName=humao.rest-client 'REST Client')

Make Sure to change the username and password in [application.properties](https://github.com/sid2425/Backend_Liv2Train_Siddartha/blob/main/src/main/resources/application.properties 'API') in order to connect to Oracle DB.

## API testing: 
**[test.http](https://github.com/sid2425/Backend_Liv2Train_Siddartha/blob/main/test.http 'test.http') can guide you.**

### Todo's 
- [x] First API
- [x] Validations for mandatory fields through constraints annotations in jpa 
- [x] API accepts data in .json format  
- [x] An appropriate error message using Spring ExceptionHandler (com.example.rest.exception)  
- [x] Second API
- [x] Use of ORM (object relation mapper)
- [x] Project Structure based on J2EE architecture 
