package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DemoEntityf_kojin7;
import com.example.demo.service.DemoServicef_kojin7;

@RestController
public class DemoController7 {
	
    private final DemoServicef_kojin7 myService;

    public DemoController7(DemoServicef_kojin7 myService) {
        this.myService = myService;
    }

    @GetMapping("/test7")
    public List<DemoEntityf_kojin7> test7(@RequestParam String kojin_no) {
        return myService.searchEntitiesByKojin_no(kojin_no);
    }
}
