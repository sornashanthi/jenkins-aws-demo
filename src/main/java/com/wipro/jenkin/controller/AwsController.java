package com.wipro.jenkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/api/v1/test")
@RestController
public class AwsController {
	@GetMapping
	public String Welcome()
	{
		return "Welcome to CICD Pipeline";
	}

}
