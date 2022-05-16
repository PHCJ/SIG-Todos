package com.fatec.todos.adapters;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/admin")
	public String AcessarPrincipal() {
		return "admin/home";
	}	
}
