package com.estudos.projectEstud.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {


    @RequestMapping(value = "/sum/{num1}/{num2}/", method= RequestMethod.GET)
    public Double sum(@PathVariable String num1, @PathVariable String num2) throws Exception{
         if(isNumeric(num1) || isNumeric(num2)) throw new IllegalArgumentException();{
            return convertToDouble(num1) + convertToDouble(num2);
        }
    }
    @RequestMapping(value = "/div/{num1}/{num2}/", method = RequestMethod.GET)
    public Double div(@PathVariable String num1, @PathVariable String num2) throws Exception{
        if(isNumeric(num1) || isNumeric(num2)) throw new IllegalArgumentException();{
            return convertToDouble(num1) / convertToDouble(num2);
        }
    }

    @RequestMapping(value = "/sub/{num1}/{num2}/", method = RequestMethod.GET)
    public Double sub(@PathVariable String num1, @PathVariable String num2) throws Exception{
        if(isNumeric(num1) || isNumeric(num2)) throw new IllegalArgumentException();{
            return convertToDouble(num1) - convertToDouble(num2);
        }
    }

    @RequestMapping(value = "/pow/{num1}/{num2}/", method = RequestMethod.GET)
    public Double pow(@PathVariable String num1, @PathVariable String num2) throws Exception{
        if(isNumeric(num1) || isNumeric(num2)) throw new IllegalArgumentException();{
            return Math.pow(convertToDouble(num1), convertToDouble(num2));
        }
    }

    @RequestMapping(value = "/med/{num1}/{num2}/{num3}/", method = RequestMethod.GET)
    public Double med(@PathVariable String num1, @PathVariable String num2, @PathVariable String num3) throws Exception{
        if((isNumeric(num1) || isNumeric(num2)) || isNumeric(num3)) throw new IllegalArgumentException();{
            return ((convertToDouble(num1) + convertToDouble(num2)) + convertToDouble(num3))/3;
        }
    }
    @RequestMapping(value = "/raiz/{num1}/", method = RequestMethod.GET)
    public Double med(@PathVariable String num1) throws Exception{
        if((isNumeric(num1))) throw new IllegalArgumentException();{
            return Math.sqrt(convertToDouble(num1));
        }
    }


    private static boolean isNumeric(String num1) {
        if(num1 == null) return true;
        String num = num1.replace(",", ".");
        return !num.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    private Double convertToDouble(String num1) throws IllegalArgumentException {
        if(num1 == null || num1.isEmpty()) throw new IllegalArgumentException();
        String num = num1.replace(",", ".");
       return Double.parseDouble(num1);

    }
}
