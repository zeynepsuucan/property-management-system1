package com.example.start.controller;

import com.example.start.model.CalculatorDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {

    //http://localhost:8080/api/v1/calculator/add?n1=6.7&n2=3.4
    @GetMapping("/add/{n3}")
    public Double add(@RequestParam("n1") Double n1, @RequestParam("n2")Double n2, @PathVariable("n3") Double n3){
        return n1+n2-n3;
    }

    @GetMapping("/sub/{n1}/{n2}") //Map values of url to java variables by Path variable method
    public Double sub(@PathVariable("n1") Double n1, @PathVariable("n2") Double n2){
        Double result = null;
        if(n1>n2)
            result = n1-n2;
        else
            result = n2-n1;
        return result;
    }

    @PostMapping("/mul")
    public Double multiply(@RequestBody CalculatorDTO calculatorDTO){
        Double result = null;
        result = calculatorDTO.getN1() * calculatorDTO.getN2() * calculatorDTO.getN3() * calculatorDTO.getN4();
        return result;
    }
}
