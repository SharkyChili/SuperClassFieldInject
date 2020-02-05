package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service("impl1")
public class ServiceImpl1 extends AbstractService {
    @Override
    public void save() {
        System.out.println("1");
        dao.save();
    }
}
