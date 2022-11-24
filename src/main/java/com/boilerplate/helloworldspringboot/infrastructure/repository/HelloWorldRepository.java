package com.boilerplate.helloworldspringboot.infrastructure.repository;

import org.springframework.stereotype.Component;

import com.boilerplate.helloworldspringboot.domain.repository.HelloWorldData;

@Component
public class HelloWorldRepository implements HelloWorldData {

	@Override
	public String getHelloWoldData(String name) {
		if (name.equals("foobar")) {
			return "tictac!";
		}
		return name + "!";
	}

}
