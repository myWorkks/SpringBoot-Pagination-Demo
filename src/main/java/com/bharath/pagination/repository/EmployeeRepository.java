package com.bharath.pagination.repository;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.bharath.pagination.entity.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
	Page<Employee> findAllByDojGreaterThan(LocalDate doj, Pageable p);
}
