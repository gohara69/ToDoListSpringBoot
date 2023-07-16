package com.example.ToDoList.Model;

import java.util.Optional;

import org.thymeleaf.util.StringUtils;


public class ToDoValidator {
	public boolean isToDoValid(ToDo toDo) {
		return Optional.ofNullable(toDo)
						.filter(t -> !StringUtils.isEmpty(t.getTieuDe()))
						.filter(t -> !StringUtils.isEmpty(t.getNoiDung()))
						.isPresent();
	}
}
