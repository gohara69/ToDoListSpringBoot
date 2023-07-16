package com.example.ToDoList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.ToDoList.Model.ToDo;
import com.example.ToDoList.Repository.ToDoRepository;

@SpringBootApplication
public class ToDoListApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ToDoListApplication.class, args);
	}
}