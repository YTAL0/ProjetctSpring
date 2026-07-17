package com.estudos.projectEstud.repository;

import com.estudos.projectEstud.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
