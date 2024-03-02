package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DemoEntityf_kojin6;
import com.example.demo.repositry.DemoRepositoryf_kojin6;

@Service
public class DemoServicef_kojin6 {

    private DemoRepositoryf_kojin6 repository;

    @Autowired
    public void MyService(DemoRepositoryf_kojin6 repository) {
        this.repository = repository;
    }
    
    public List<DemoEntityf_kojin6> getAllEntities() {
        return repository.findAll();
    }

}