package com.employee.employeeJobCreate;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeeJobCreate.entity.employeeJobCreateEntity;



@RestController

public class employeeJobCreateController {

	@Autowired
	private employeeJobCreateService employeeService;
	
	@PostMapping("/api/employees")
	public employeeJobCreateEntity saveEmployee(@RequestBody employeeJobCreateEntity employee) throws ParseException {
		return employeeService.saveEmployee(employee);
	}
	
	@RequestMapping(value = "/api/employees", method = RequestMethod.GET, produces = "application/json")
	public Iterable<employeeJobCreateEntity> list() {
		Iterable<employeeJobCreateEntity> employeeList = employeeService.listAllEmployee();
		return employeeList;
	}

	@RequestMapping(value = "/api/employees/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<employeeJobCreateEntity> showEmployee(@PathVariable Long id) {
		 
		return employeeService.getEmployeeById(id);
	}
	
}
