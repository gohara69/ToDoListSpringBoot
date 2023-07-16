package com.example.ToDoList.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.ToDoList.Model.ToDoValidator;

@Configuration
public class ToDoConfig {

	@Bean
	public ToDoValidator vadilator() {
		return new ToDoValidator();
	}
}
