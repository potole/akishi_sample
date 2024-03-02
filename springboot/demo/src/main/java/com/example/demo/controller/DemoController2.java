package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController2 {
	
	@GetMapping("/test2")
	public MyData test2() {
		MyData mydata = new MyData();
		mydata.setName("エロ　太郎");
		mydata.setAge(55);
		
		return mydata;
	}
	
	
    public class MyData {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

	
}






	
