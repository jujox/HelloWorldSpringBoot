package com.boilerplate.helloworldspringboot.integration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.boilerplate.helloworldspringboot.domain.HelloWorldService;

@SpringBootTest
class HelloWorldServiceIntegrationTests {

	@Autowired
	private HelloWorldService helloWorldService;

	@Test
	void testFooBar() {
		Assertions.assertEquals("Hello, tictac!", helloWorldService.getHelloWorld("foobar"));
	}

	@Test
	void testNotFoobarOK() {
		Assertions.assertEquals("Hello, you!", helloWorldService.getHelloWorld("you"));
	}

}
