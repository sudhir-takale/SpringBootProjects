package com.example.demo.controlller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {
	@GetMapping("/")
	public String getData() {
		System.out.println("This is testing website");
		return "Sudhir Hanmant Takale";
	}
}
