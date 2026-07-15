package com.estudos.projectEstud.services;

import static com.estudos.projectEstud.services.NumericService.convertToDouble;
import static com.estudos.projectEstud.services.NumericService.isNumeric;

public class MathServices {
    public static Double sum(String num1, String num2) throws Exception{
        if(isNumeric(num1) || isNumeric(num2)) throw new IllegalArgumentException();{
            return convertToDouble(num1) + convertToDouble(num2);
        }
    }
    public static Double sub(String num1, String num2) throws Exception{
        if(isNumeric(num1) || isNumeric(num2)) throw new IllegalArgumentException();{
            return convertToDouble(num1) - convertToDouble(num2);
        }
    }
    public static Double div(String num1, String num2) throws Exception{
        if(isNumeric(num1) || isNumeric(num2)) throw new IllegalArgumentException();{
            return convertToDouble(num1) / convertToDouble(num2);
        }
    }
    public static Double pow(String num1, String num2) throws Exception{
        if(isNumeric(num1) || isNumeric(num2)) throw new IllegalArgumentException();{
            return Math.pow(convertToDouble(num1), convertToDouble(num2));
        }
    }
    public static Double med(String num1, String num2, String num3) throws Exception{
        if((isNumeric(num1) || isNumeric(num2)) || isNumeric(num3)) throw new IllegalArgumentException();{
            return ((convertToDouble(num1) + convertToDouble(num2)) + convertToDouble(num3))/3;
        }
    }
    public static Double sqrt(String num1){
        if((isNumeric(num1))) throw new IllegalArgumentException();{
            return Math.sqrt(convertToDouble(num1));
        }
    }

}
