package com.estudos.projectEstud.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

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
    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public long getID() {
        return ID;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return ID == person.ID && Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName) && Objects.equals(gender, person.gender) && Objects.equals(adress, person.adress);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", ID=" + ID +
                ", adress='" + adress + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, gender, ID, adress);
    }
}
