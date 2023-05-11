package com.bharath.pagination.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer emp_id;
	@Column(nullable = false)
	private String emp_name;
	@Column(nullable = false)
	//@Temporal(TemporalType.DATE)
	private LocalDate doj;
	@Column(nullable = false)
	private Float salary;
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", doj=" + doj + ", salary=" + salary + "]";
	}
	
	
	
	
}
