package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController4 {
	@GetMapping("/test4")
	public String test4(@RequestParam String key1, @RequestParam String key2) {
		System.out.println(key1);
		System.out.println(key2);
		
		String test = "<p>key1の値は「" + key1 + "」でした。</p>" +
					  "<p>key2の値は「" + key2 + "」でした。</p>";
		
		return test;
		
	}
	
	@GetMapping("/test4_2/{key1}/{key2}")
	public String test4_2(@PathVariable String key1, @PathVariable String key2) {
		System.out.println(key1);
		System.out.println(key2);
		
		String test = "<p>key1の値は「" + key1 + "」でした。</p>" +
					  "<p>key2の値は「" + key2 + "」でした。</p>";
		
		return test;
		
	}
	
	
}
