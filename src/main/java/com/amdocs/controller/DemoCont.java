package com.amdocs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCont {
	@GetMapping("/in")
	public String show() {
		return "Employee Id = 201383. Employee name = Usha";
	}

}
