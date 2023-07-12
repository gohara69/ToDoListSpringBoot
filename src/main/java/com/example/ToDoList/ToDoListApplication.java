package com.example.ToDoList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ToDoListApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ToDoListApplication.class, args);
	}
}