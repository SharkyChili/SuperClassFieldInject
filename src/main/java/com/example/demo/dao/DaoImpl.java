package com.example.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements Dao {

    @Override
    public void save() {
        System.out.println("save");
    }
}
