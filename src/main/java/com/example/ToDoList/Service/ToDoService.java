package com.example.ToDoList.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.ToDoList.Model.ToDo;
import com.example.ToDoList.Model.ToDoValidator;
import com.example.ToDoList.Repository.ToDoRepository;

@Service
public class ToDoService {
	@Autowired
	private ToDoRepository toDoRepository;
	
	@Autowired
	private ToDoValidator toDoValidator;
	
	public List<ToDo> findAll(Integer limit){
		return Optional.ofNullable(limit)
					.map(value -> toDoRepository.findAll(PageRequest.of(0, value)).getContent())
					.orElseGet(() -> toDoRepository.findAll());
	}
	
	public ToDo addDo (ToDo toDo) {
		if(toDoValidator.isToDoValid(toDo)) {
			return toDoRepository.save(toDo);
		}
		return null;
	}
}
