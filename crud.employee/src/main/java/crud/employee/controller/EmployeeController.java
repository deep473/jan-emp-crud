package crud.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import crud.employee.entity.Employee;
import crud.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@PostMapping("/create")
	public void createNewEmployee(@ModelAttribute Employee emp) {
		service.createNewEmployee(emp);
	}
	
	@GetMapping("/createPage")
	public String createPage() {
		return "create";	//create.html
	}
	
}
