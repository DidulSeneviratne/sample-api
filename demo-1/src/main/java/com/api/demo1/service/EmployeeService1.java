package com.api.demo1.service;

import java.util.List;

import com.api.demo1.model.Employee1;

public interface EmployeeService1 {

	public List<Employee1> getAllEmp();
	public List<Employee1> findByEmpId(int id);
	public List<Employee1> findByEmpName(String name);
	public List<Employee1> findBySearchString(String searchKeyword);
	public List<Employee1> findByNameAndDepartment(String name, String department);
	public List<Employee1> saveEmployee(Employee1 emp);
	public List<Employee1> updateEmployee(Employee1 emp);
	public List<Employee1> deleteEmployee(Employee1 emp);
	
}
