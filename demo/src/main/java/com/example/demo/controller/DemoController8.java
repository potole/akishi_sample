package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DemoEntityf_kojin8;
import com.example.demo.service.DemoServicef_kojin8;

@RestController
public class DemoController8 {

    @Autowired
    private DemoServicef_kojin8 myService;

    @GetMapping("/test8")
    public List<DemoEntityf_kojin8> test8(@RequestParam String kojin_no) {
        return myService.getfkojinById(kojin_no);
    }
}
