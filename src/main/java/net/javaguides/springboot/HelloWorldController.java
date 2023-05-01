package net.javaguides.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("message"," idi controller ichina msg ");
		return "helloworld";
	}
	
	@GetMapping("/style")
	public String style() {
		return "add-css-js-demo";
	}
	
	
	@GetMapping("/bootstrap1")
	public String bootstrap() {
		return "add-bootstrap";
	}
}
