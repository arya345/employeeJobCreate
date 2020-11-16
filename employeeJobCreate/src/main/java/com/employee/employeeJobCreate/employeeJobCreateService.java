package com.employee.employeeJobCreate;

import java.util.Optional;

import com.employee.employeeJobCreate.entity.employeeJobCreateEntity;

public interface employeeJobCreateService {

	employeeJobCreateEntity saveEmployee(employeeJobCreateEntity employee);

	Iterable<employeeJobCreateEntity> listAllEmployee();

	Optional<employeeJobCreateEntity> getEmployeeById(Long id);

}
