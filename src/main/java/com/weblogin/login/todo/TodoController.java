package com.weblogin.login.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("name")
public class TodoController {

//	public TodoController(TodoService todoService) {
//		super();
//		this.todoService = todoService;
//	}
//
//	private TodoService todoService;
//		
//	
//	@RequestMapping("list-todos")
//	public String listAllTodos(ModelMap model) {
//		List<Todo> todos = todoService.findByUsername("in28minutes");
//		model.addAttribute("todos", todos);
//		System.out.println(todos);
//		return "listTodos";
//	}
//	
//
//	@RequestMapping(value="add-todo",method= RequestMethod.GET)
//	public String showNewTodoPage() {
//		return "todo";
//	}
//	
//	@RequestMapping(value="add-todo", method = RequestMethod.POST)
//	public String addNewTodo(@RequestParam String description, Todo todo, ModelMap model) {
//		String username =(String)model.get("name");
//		todoService.addTodo(username, description,LocalDate.now().plusYears(1),false);
//				
//		return "redirect:list-todos"; // used to add new todo from user and populate the List todo page along with newly added todo
//	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(ModelMap model) {
		ModelAndView retVal = new ModelAndView();
		List<Todo> todos = new ArrayList<Todo>();
		todos.add(new Todo(1, "in28minutes", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "in28minutes", "Learn DevOps", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(3, "in28minutes", "Learn Full Stack Development", LocalDate.now().plusYears(3), false));
		model.addAttribute("todos", todos);
		//model.setViewName("index");
		return "listTodos";
	}
}
