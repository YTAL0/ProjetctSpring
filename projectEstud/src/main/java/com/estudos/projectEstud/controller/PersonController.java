package com.estudos.projectEstud.controller;

import com.estudos.projectEstud.model.Person;
import com.estudos.projectEstud.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/person")
@RestController
public class PersonController {

    @Autowired
    private PersonServices service;
    @GetMapping(value = "/{id}/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findByID(@PathVariable("id") Long id){
        return service.findByID(id);
    }

    @GetMapping(value = "/all/",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> findAll(){
        if(service.findAll().isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping(
    produces = MediaType.APPLICATION_JSON_VALUE,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    public Person create(@RequestBody Person person) {
        return service.create(person);
    }
    @PutMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person update(@RequestBody Person person) {
        return service.update(person);
    }
    @DeleteMapping(value = "/{id}/")
    public ResponseEntity delete(@PathVariable("id") Long id, HttpMethod httpMethod){
        service.delete(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("delete");
    }

}
