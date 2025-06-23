package com.solution.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.solution.process.Activity;
import com.solution.process.Coding;
import com.solution.process.Documenting;
import com.solution.process.Integration;

@Configuration
public class AppConfiguration {
	{
		System.out.println("AppConfiguration initialized");
	}
	@Bean("doc")
	@Scope("prototype") // Change to "prototype" to create a new instance each time
	public Activity documenting() {
		return new Documenting();
	}
	@Bean("coding")
	@Scope("prototype") // Change to "prototype" to create a new instance each time
	public Activity coding() {
		return new Coding();
	}
	
	@Bean("integration")
    public Integration integration() {
		return new Integration();
	}
}
