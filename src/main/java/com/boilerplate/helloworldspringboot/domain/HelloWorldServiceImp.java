package com.boilerplate.helloworldspringboot.domain;

import com.boilerplate.helloworldspringboot.domain.repository.HelloWorldData;

public class HelloWorldServiceImp implements HelloWorldService {

	private HelloWorldData helloWorldData;

	public HelloWorldServiceImp(HelloWorldData helloWorldData) {
		this.helloWorldData = helloWorldData;
	}

	@Override
	public String getHelloWorld(String name) {
		return "Hello, " + this.helloWorldData.getHelloWoldData(name);
	}

}
