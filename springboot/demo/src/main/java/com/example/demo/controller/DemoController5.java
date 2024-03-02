package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController5 {
	
	@PostMapping("/test5")
	public String test5(@RequestBody String requestData) {
		System.out.println(requestData);
		
		String test = "<p>受け取った値は</p>" +
					  requestData +
					  "<p>でした。</p>";
		
		return test;
		
	}
}
