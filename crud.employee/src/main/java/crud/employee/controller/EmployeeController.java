package crud.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import crud.employee.entity.Employee;
import crud.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@PostMapping("/create")
	public void createNewEmployee(@RequestBody Employee emp) {
		service.createNewEmployee(emp);
	}
}
