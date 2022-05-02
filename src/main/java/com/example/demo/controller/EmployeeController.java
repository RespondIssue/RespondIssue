package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

	private final EmployeeService service;

	@GetMapping("/{id}")
	public Employee get(@PathVariable Long id) {
		return service.getEmployeeId(id);
	}

	@GetMapping
	public List<Employee> getAll() {
		return service.getEmployees();
	}

	@PostMapping
	public Employee post(@RequestBody Employee employee) {
		return service.postEmployee(employee);
	}
}
