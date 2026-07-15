package com.estudos.projectEstud.controller;

import com.estudos.projectEstud.services.MathServices;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @RequestMapping(value = "/sum/{num1}/{num2}/", method= RequestMethod.GET)
    public Double sum(@PathVariable String num1, @PathVariable String num2) throws Exception{
            return MathServices.sum(num1, num2);
    }
    @RequestMapping(value = "/div/{num1}/{num2}/", method = RequestMethod.GET)
    public Double div(@PathVariable String num1, @PathVariable String num2) throws Exception{
        return MathServices.div(num1, num2);
    }
    @RequestMapping(value = "/sub/{num1}/{num2}/", method = RequestMethod.GET)
    public Double sub(@PathVariable String num1, @PathVariable String num2) throws Exception{
        return MathServices.sub(num1, num2);
    }
    @RequestMapping(value = "/pow/{num1}/{num2}/", method = RequestMethod.GET)
    public Double pow(@PathVariable String num1, @PathVariable String num2) throws Exception{
        return MathServices.pow(num1, num2);
    }
    @RequestMapping(value = "/med/{num1}/{num2}/{num3}/", method = RequestMethod.GET)
    public Double med(@PathVariable String num1, @PathVariable String num2, @PathVariable String num3) throws Exception{
        return MathServices.med(num1, num2, num3);
    }
    @RequestMapping(value = "/sqrt/{num1}/", method = RequestMethod.GET)
    public Double sqrt(@PathVariable String num1) throws Exception{
        return MathServices.sqrt(num1);
    }

}
