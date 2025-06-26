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
	@PostMapping("/update")
	public void updateEmployee(@ModelAttribute Employee emp) {
		service.updateEmployee(emp);
	}
	@GetMapping("/delete")
	public void deleteEmployee(Long id) {
		service.deleteEmployee(id);
	}
	@GetMapping("/search")
	public Employee searchEmployee(Long id) {
		Employee emp = service.searchEmployee(id);
		System.out.println(emp);
		return emp;
	}
	

	@GetMapping("/createPage")
	public String createPage() {
		return "create";	//create.html
	}
	@GetMapping("/searchPage")
	public String searchPage() {
		return "search";	//search.html
	}
	@GetMapping("/updatePage")
	public String updatePage() {
		return "update";	//update.html
	}
	@GetMapping("/deletePage")
	public String deletePage() {
		return "delete";	//delete.html
	}
	
}
