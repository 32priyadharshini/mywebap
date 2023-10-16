package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MywebappController {
	@GetMapping(value="/get")
	public String get() {
		return "this is program";
	}

}
