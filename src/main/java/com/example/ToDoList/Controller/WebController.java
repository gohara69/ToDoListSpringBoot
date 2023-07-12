package com.example.ToDoList.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ToDoList.Model.ToDo;

@Controller
public class WebController {
	List<ToDo> listToDo = new CopyOnWriteArrayList<>();
	
	@GetMapping({"/","/index","/home"})
	public String home(Model model) {
		if(listToDo.size() == 0) {
			System.out.println("List có độ dài là 0");
			initToDoList();
		}
		model.addAttribute("toDo", new ToDo());
		model.addAttribute("toDoList", listToDo);
		return "index";
	}
	
	public void initToDoList() {
		listToDo.add(new ToDo("thuky", "hom nay nho di cong chung giay to nha!!"));
	}
	
	@PostMapping("/addToDo")
	public String addToDo(ToDo toDo, Model model) {
		listToDo.add(toDo);
		model.addAttribute("toDo", new ToDo());
		model.addAttribute("toDoList", listToDo);
		return "redirect:/index";
	}
}
