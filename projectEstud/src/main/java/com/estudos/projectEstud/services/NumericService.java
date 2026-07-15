package com.estudos.projectEstud.services;

public class NumericService {
    public static boolean isNumeric(String num1) {
        if(num1 == null) return true;
        String num = num1.replace(",", ".");
        return !num.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
    public static Double convertToDouble(String num1) throws IllegalArgumentException {
        if(num1 == null || num1.isEmpty()) throw new IllegalArgumentException();
        String num = num1.replace(",", ".");
        return Double.parseDouble(num1);
    }
}
