package com.bharath.pagination;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bharath.pagination.entity.Employee;
import com.bharath.pagination.service.EmployeeService;

@SpringBootApplication
public class PaginationDemoApplication {
	@Autowired
	private EmployeeService empService;

	public void viewEmployeesInPages() {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter page number");
		Integer pageNumber = sc.nextInt();
		System.out.println("enter requird number of entities");
		Integer noOfEntitiesPerPage = sc.nextInt();
		List<Employee> list = empService.findAllUsingPAgination(pageNumber, noOfEntitiesPerPage);
		for (Employee e : list) {
			System.out.println(e);
		}

	}

	public void viewEmployeesInPagesAfterDAte() {
		LocalDate date = LocalDate.of(2020, 12, 1);
		int startPAge = 0;
		int noOfEntities = 5;
		List<Employee> list = empService.findAllEmployeesAfterDate(date, startPAge, noOfEntities);
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext c = SpringApplication.run(PaginationDemoApplication.class, args);
		PaginationDemoApplication o = c.getBean(PaginationDemoApplication.class);
		//o.viewEmployeesInPages();
		 o.viewEmployeesInPagesAfterDAte();
	}

}
