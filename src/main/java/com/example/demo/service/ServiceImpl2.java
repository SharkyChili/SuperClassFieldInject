package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service("impl2")
public class ServiceImpl2 extends AbstractService {
    @Override
    public void save() {
        System.out.println("2");
        dao.save();
    }
}
