package com.estudos.projectEstud.services;

import com.estudos.projectEstud.exception.ResourceNotFoundException;
import com.estudos.projectEstud.model.Person;
import com.estudos.projectEstud.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    PersonRepository repository;

    private Logger logger = Logger.getLogger(Person.class.getName());

    public List <Person> findAll(){
        return repository.findAll();
    }

    public Person findByID(Long id){
        logger.info("Create person");
        return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("no record"));
    }
    public Person create(Person person){
        logger.info("Create people");
        return repository.save(person);
    }
    public void delete(Long id){
        logger.info("Deletaaaaaaaaaaaaaaaado");;
        Person entity= repository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("no record"));
        repository.delete(entity);
    }
    public Person update(Person person){
        Person entity = repository.findById(person.getID())
                .orElseThrow(()-> new ResourceNotFoundException("no record"));
        entity.setName(person.getName());
        entity.setLastName(person.getLastName());
        entity.setAdress(person.getAdress());
        entity.setGender(person.getGender());
        return repository.save(person);
    }


}
