package com.example.cloudClient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${some.value}")
	private String myvalue;
	
	@GetMapping("/myValue")
	public String getValue() {
		return myvalue;
	}
	
}