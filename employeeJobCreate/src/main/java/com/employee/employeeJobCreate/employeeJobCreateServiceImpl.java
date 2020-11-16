package com.employee.employeeJobCreate;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.employeeJobCreate.entity.employeeJobCreateEntity;

public class employeeJobCreateServiceImpl implements employeeJobCreateService{
	
	@Autowired
	private employeeJobCreateRepository employeeRepository;
	
	@Override
	public employeeJobCreateEntity saveEmployee(employeeJobCreateEntity employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public Iterable<employeeJobCreateEntity> listAllEmployee() {
		Iterable<employeeJobCreateEntity>  iterable = employeeRepository.findAll();
		return iterable;
	}

	@Override
	public Optional<employeeJobCreateEntity> getEmployeeById(Long id) {
		
		return employeeRepository.findById(id);
	}

}
