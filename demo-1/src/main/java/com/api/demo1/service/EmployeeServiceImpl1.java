package com.api.demo1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.demo1.model.Employee1;
import com.api.demo1.util.EmpOprs1;

@Service
public class EmployeeServiceImpl1 implements EmployeeService1{

	@Override
	public List<Employee1> getAllEmp() {
		// TODO Auto-generated method stub
		EmpOprs1 oprs = new EmpOprs1();
		return oprs.getAllEmployees();
	}
	
	@Override
	public List<Employee1> findByEmpId(int id) {
		// TODO Auto-generated method stub
		EmpOprs1 empOprs = new EmpOprs1();
		return empOprs.getEmployeeById(id);
	}

	@Override
	public List<Employee1> findByEmpName(String name) {
		// TODO Auto-generated method stub
		EmpOprs1 empOprs = new EmpOprs1();
		return empOprs.getEmployeeByName(name);
	}

	@Override
	public List<Employee1> findBySearchString(String searchKeyword) {
		// TODO Auto-generated method stub
		EmpOprs1 empOprs = new EmpOprs1();
		return empOprs.getEmployeeBySearchName(searchKeyword);
	}

	@Override
	public List<Employee1> findByNameAndDepartment(String name, String department) {
		// TODO Auto-generated method stub
		EmpOprs1 empOprs = new EmpOprs1();
		return empOprs.getEmployeeByNameAndDepartment(name, department);
	}

	@Override
	public List<Employee1> saveEmployee(Employee1 emp) {
		// TODO Auto-generated method stub
		EmpOprs1 empOprs = new EmpOprs1();
		return empOprs.saveEmployee(emp);
	}

	@Override
	public List<Employee1> updateEmployee(Employee1 emp) {
		// TODO Auto-generated method stub
		EmpOprs1 empOprs = new EmpOprs1();
		return empOprs.updateEmployee(emp);
	}

	@Override
	public List<Employee1> deleteEmployee(Employee1 emp) {
		// TODO Auto-generated method stub
		EmpOprs1 empOprs = new EmpOprs1();
		return empOprs.deleteEmployee(emp);
	}

}
