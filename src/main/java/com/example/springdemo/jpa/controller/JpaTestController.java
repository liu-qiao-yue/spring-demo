package com.example.springdemo.jpa.controller;

import com.example.springdemo.jpa.service.JpaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jpa")
@Slf4j
public class JpaTestController {
    @Autowired
    private final JpaService jpaService;

    @Autowired
    public JpaTestController(JpaService jpaService){
        this.jpaService = jpaService;
    }

    @PostMapping("/findById")
    public boolean findById(){
        log.info("----------------findById");
        return jpaService.findById();
    }

    @PostMapping("/find")
    public boolean find(){
        log.info("----------------find");
        return jpaService.find();
    }

    @PostMapping("/update")
    public int update(){
        log.info("----------------update");
        return jpaService.update();
    }

    @PostMapping("/findAndUpdate")
    public int findAndUpdate(){
        log.info("----------------findAndUpdate");
        return jpaService.findAndUpdate();
    }
}
