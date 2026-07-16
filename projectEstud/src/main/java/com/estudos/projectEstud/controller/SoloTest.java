package com.estudos.projectEstud.controller;

import com.estudos.projectEstud.model.Champion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/solo")
public class SoloTest {

     Champion champ;

     @RequestMapping("/champ")
     public String champReturn(
             @RequestParam(value = "name", defaultValue = "") String name,
             @RequestParam(value = "power", defaultValue = "") String power
     ){
         Champion cha1 = new Champion(name, Double.parseDouble(power));
         return cha1.toString();
     }
     @RequestMapping("/ola")
    public String test(){
        return "Ola";
    }

}
