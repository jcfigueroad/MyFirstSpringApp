package cl.tswoo.lab.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
	
	@GetMapping({"/index","/home"})
	public String lerolero () {
		
		return "index";
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(name="text", required = true) String name, Model modelo) {
		modelo.addAttribute("title","Reprobe!");
		modelo.addAttribute("name",name);
		return "hello";
	}
}
