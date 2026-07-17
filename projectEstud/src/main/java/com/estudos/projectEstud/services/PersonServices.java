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
        logger.info("Return people");
        return person;
    }

    public Person findByID(String id){
        logger.info("Create person");
        Person person1 = new Person();
        person.add(person1);
        person1.setID(counter.incrementAndGet());
        person1.setName("Ytalo");
        person1.setLastName("NUnes");
        person1.setAdress("Caninde-CE");
        person1.setGender("M" + id);
        return person1;
    }
    public Person create(Person person){
        logger.info("Create people");
        this.person.add(person);
        int tam = this.person.size() - 1;
        person.setID(counter.incrementAndGet());
        return this.person.get(tam);
    }
    public void delete(String id){
        logger.info("Deletaaaaaaaaaaaaaaaado");
        int t = Integer.parseInt(id);
        person.remove(t - 1);
    }

}
