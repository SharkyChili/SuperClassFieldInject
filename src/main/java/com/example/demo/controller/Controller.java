package com.example.demo.controller;

import com.example.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Qualifier("impl1")
//    @Qualifier("impl2")
    @Autowired
    Service service;

    public void save(){
        service.save();
    }

}
