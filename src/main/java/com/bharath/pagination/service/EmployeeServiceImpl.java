package com.bharath.pagination.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.bharath.pagination.entity.Employee;
import com.bharath.pagination.repository.EmployeeRepository;

@Service(value = "employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository empRepository;

	@Override
	public List<Employee> findAllUsingPAgination(Integer startPage, Integer noOfEntitiesPerPAge) {
		Pageable p = PageRequest.of(startPage, noOfEntitiesPerPAge);

		Page<Employee> page = empRepository.findAll(p);
		if (page.hasContent()) {
			List<Employee> list = page.getContent();
			return list;
		}
		throw new RuntimeException("Sorry no entities found in pafe number you provided");
	}

	@Override
	public List<Employee> findAllEmployeesAfterDate(LocalDate date, Integer startPage, Integer noOfEntitiesPerPAge) {
		Pageable p = PageRequest.of(startPage, noOfEntitiesPerPAge);
		Page<Employee> pages = empRepository.findAllByDojGreaterThan(date, p);
		if (pages.hasContent())
			return pages.getContent();
		else
			throw new RuntimeException("No entities found in this page");
	}

}
