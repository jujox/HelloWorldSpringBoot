package com.boilerplate.helloworldspringboot.unit;

import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.boilerplate.helloworldspringboot.domain.HelloWorldServiceImp;
import com.boilerplate.helloworldspringboot.domain.repository.HelloWorldData;

@ExtendWith(MockitoExtension.class)
public class HelloWorldServiceUnitTest {

	@Mock
	private HelloWorldData helloWorldData;

	@InjectMocks
	private HelloWorldServiceImp helloWorldService;

	@Test
	void testService() {
		doReturn("something").when(helloWorldData).getHelloWoldData("foobar");
		Assertions.assertEquals("Hello, something", helloWorldService.getHelloWorld("foobar"));
	}
}
