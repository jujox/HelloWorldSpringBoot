package com.boilerplate.helloworldspringboot.application.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.boilerplate.helloworldspringboot.HelloWorldApplication;
import com.boilerplate.helloworldspringboot.domain.HelloWorldServiceImp;
import com.boilerplate.helloworldspringboot.domain.repository.HelloWorldData;
import com.boilerplate.helloworldspringboot.domain.HelloWorldService;

@Configuration
@ComponentScan(basePackageClasses = HelloWorldApplication.class)

public class BeanConfiguration {
	@Bean
	HelloWorldService getHelloWorldService(HelloWorldData helloWorldData) {
		return new HelloWorldServiceImp(helloWorldData);
	}

}
