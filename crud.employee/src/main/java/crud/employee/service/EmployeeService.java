package crud.employee.service;

import crud.employee.entity.Employee;

public interface EmployeeService {
	
	void createNewEmployee(Employee emp);
	
	void updateEmployee(Employee emp);
	
	void deleteEmployee(Long id);
}
