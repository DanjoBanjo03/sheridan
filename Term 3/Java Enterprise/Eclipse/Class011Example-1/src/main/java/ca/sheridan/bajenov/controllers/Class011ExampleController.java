package ca.sheridan.bajenov.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class Class011ExampleController {
	@GetMapping("/index")
	public String index() {
		return "index.html";
	}
	@GetMapping("/input")
	public String userInput() {
		return "input.html";
	}
	@GetMapping("/userInput")
	public String formPost(Model model,
	@RequestParam String firstName, @RequestParam String lastName) {
		String m = "Flow of control and flow of data in a Java EE application";
		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
		model.addAttribute("Message", m);
		return "inputData.html";
	}
}
