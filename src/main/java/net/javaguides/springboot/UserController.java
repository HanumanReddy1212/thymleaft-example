package net.javaguides.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	@GetMapping("/if-unless")
	public String users(Model model) {
		List<User> users=new ArrayList<>();
		users.add(new User("Ramesh","babu","ADMIN"));
		users.add(new User("sdf","erg","USER"));
		users.add(new User("afd","baregerbu","USER"));
		model.addAttribute("users",users);
		return "if-unless";
	}
	
	@GetMapping("/switch-case")
	public String switchExample(Model model) {
		User user=new User("Ramesh","babu","ADMIN");
		model.addAttribute("user",user);
		return "switch-case";
	}
}
