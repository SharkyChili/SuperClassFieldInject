package com.example.demo.service;

import com.example.demo.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractService implements Service {
    @Autowired
//    protected Dao dao;//这里不知道为什么
     Dao dao;//这里不知道为什么
}
