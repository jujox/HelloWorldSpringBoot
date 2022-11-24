package com.boilerplate.helloworldspringboot.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boilerplate.helloworldspringboot.domain.HelloWorldService;

@RestController
@RequestMapping("/v1")
public class HelloWorldController {
	
	@Autowired
	private HelloWorldService helloWorldService;

	@GetMapping("/hello")
	public String helloWorld(String name) {
		return helloWorldService.getHelloWorld(name);
	}
}
