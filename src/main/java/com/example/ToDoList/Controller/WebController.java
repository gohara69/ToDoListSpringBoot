package com.example.ToDoList.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ToDoList.Model.ToDo;
import com.example.ToDoList.Repository.ToDoRepository;
import com.example.ToDoList.Service.ToDoService;

@Controller
public class WebController {
	@Autowired
	private ToDoService service;
	
	@GetMapping({"/","/index","/home"})
	public String home(Model model, @RequestParam(value = "limit", required = false)Integer limit) {
		model.addAttribute("listToDo", service.findAll(limit));
		model.addAttribute("toDo", new ToDo());
		return "index";
	}
	
	@PostMapping("/addToDo")
	public String addToDo(ToDo toDo, Model model, @RequestParam(value = "limit", required = false)Integer limit) {
		model.addAttribute("second", true);
		model.addAttribute("result", service.addDo(toDo));
		model.addAttribute("listToDo", service.findAll(limit));
		model.addAttribute("toDo", new ToDo());
		return "index";
	}
}
