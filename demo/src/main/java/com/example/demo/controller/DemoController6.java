package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DemoEntityf_kojin6;
import com.example.demo.service.DemoServicef_kojin6;

@RestController
public class DemoController6 {
	
    private DemoServicef_kojin6 myService;

    @Autowired
    public void MyController(DemoServicef_kojin6 myService) {
        this.myService = myService;
    }

    @GetMapping("/test6")
    public List<DemoEntityf_kojin6> test6() {
        return myService.getAllEntities();
    }
}
