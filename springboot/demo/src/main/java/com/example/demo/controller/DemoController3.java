package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController3 {
	
	@GetMapping("/test3")
	public List<MyData> test3() {
		
		List<MyData> myList = new ArrayList<>();
		
		MyData myData = new MyData();
		myData.setName("エロ　太郎");
		myData.setAge(55);
		myList.add(myData);
		
		myData = new MyData();
		myData.setName("すけべ　太郎");
		myData.setAge(33);
		myList.add(myData);
		
		return myList;
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
