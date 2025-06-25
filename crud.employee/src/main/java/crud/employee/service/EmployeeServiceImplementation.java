package crud.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.employee.entity.Employee;
import crud.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation 
					implements EmployeeService {
	@Autowired
	EmployeeRepository repo;

	public void createNewEmployee(Employee emp) {
		repo.save(emp);
	}
	
}
