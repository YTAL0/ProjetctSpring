package com.estudos.projectEstud.model;

import java.util.Objects;

public class Champion {

    private String name;
    private double power;

    public Champion() {
    }

    public Champion(String name, double power) {
        this.name = name;
        this.power = power;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Champion champion)) return false;
        return Double.compare(power, champion.power) == 0 && Objects.equals(name, champion.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
