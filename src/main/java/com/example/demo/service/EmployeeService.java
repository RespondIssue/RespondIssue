package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {

	private final EmployeeRepository repository;

	public Employee getEmployeeId(Long id) {
		return repository.findById(id).orElse(null);
	}

	public List<Employee> getEmployees() {
		return repository.findAll();
	}

	public Employee postEmployee(Employee employee) {
		return repository.save(employee);
	}
}