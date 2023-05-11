package com.bharath.pagination.service;

import java.time.LocalDate;
import java.util.List;

import com.bharath.pagination.entity.Employee;

public interface EmployeeService {
	List<Employee> findAllUsingPAgination(Integer startPage, Integer noOfEntitiesPerPAge);

	List<Employee> findAllEmployeesAfterDate(LocalDate date, Integer startPage, Integer noOfEntitiesPerPAge);
}
