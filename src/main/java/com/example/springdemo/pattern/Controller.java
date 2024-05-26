package com.example.springdemo.pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/type")
public class Controller {

    @Autowired
    private final List<Type> types;

    public Controller(List<Type> types){
        this.types = types;
    }

    @PostMapping("/test")
    public Object findById(){
        return types.stream().filter(i-> i.support("F")).findFirst().orElse(new DefaultTypeImpl()).calc(BigDecimal.valueOf(10));
    }
}
