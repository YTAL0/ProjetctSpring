package com.estudos.projectEstud.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "person")
public class Person implements Serializable {
    private static final long serialVersionUID = 1l;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
   @Column(name = "first_name", nullable = false, length = 80)
    private String name;
    @Column(name = "last_name", nullable = false, length = 80)
    private String lastName;
    @Column(nullable = false, length = 1)
    private String gender;
    @Column(nullable = false, length = 100)
    private String adress;

}
