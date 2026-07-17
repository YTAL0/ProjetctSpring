package com.estudos.projectEstud.model;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private static final long serialVersionUID = 1l;
    private String name;
    private String lastName;
    private String gender;
    private long ID;
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
