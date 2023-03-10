package org.comstudy.todo.controller;

import java.util.List;

import org.comstudy.todo.domain.TodoEntity;
import org.comstudy.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
	@Autowired
	TodoService todoService;

	@GetMapping("/todo/list")
	public String selectList() {
		String userId = "";
		List<TodoEntity> todoList = todoService.findAll();
		System.out.print(">>>>>>>> todo list: ");
		for(TodoEntity todo :todoList) {
			System.out.println(todo);
		}
		return "todo list";
	}
}
