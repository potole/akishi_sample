package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DemoEntityf_kojin8;
import com.example.demo.mapper.DemoMapper8;

@Service
public class DemoServicef_kojin8 {

	@Autowired
    DemoMapper8 mapper8;

    public List<DemoEntityf_kojin8> getfkojinById(String kojin_no) {
        return mapper8.getfkojinById(kojin_no);
    }
}