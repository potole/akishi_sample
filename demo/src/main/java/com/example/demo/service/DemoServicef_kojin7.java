package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DemoEntityf_kojin7;
import com.example.demo.repositry.DemoRepositoryf_kojin7;

@Service
public class DemoServicef_kojin7 {

    @Autowired
    private DemoRepositoryf_kojin7 repository;

//    public void MyService(DemoRepositoryf_kojin7 repository) {
//        this.repository = repository;
//    }
    
    public List<DemoEntityf_kojin7> searchEntitiesByKojin_no(String kojin_no) {
        return repository.findByKojinNo(kojin_no);
    }

}