package com.estudos.projectEstud.services;

import com.estudos.projectEstud.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(Person.class.getName());

    private List<Person>person = new ArrayList<Person>();

    public List <Person> findAll(){
        return person;
    }

    public Person findByID(String id){
        logger.info("UUUUUUUUUU");
        Person person1 = new Person();
        person.add(person1);
        person1.setID(counter.incrementAndGet());
        person1.setName("Ytalo");
        person1.setLastName("NUnes");
        person1.setAdress("Caninde-CE");
        person1.setGender("M" + id);
        return person1;
    }
}
