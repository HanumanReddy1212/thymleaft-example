package net.javaguides.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("/iteration")
	public String bootstrap(Model model) {
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee("Ramesh","babu","ramesh@gmail.com"));
		employees.add(new Employee("sdf","erg","rrsg@gmail.com"));
		employees.add(new Employee("afd","baregerbu","rrgter@gmail.com"));
		employees.add(new Employee("reg","ytjyt","rrrt@gmail.com"));
		model.addAttribute("employees",employees);
		return "iteration";
	}
}
