package com.api.demo1.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.api.demo1.model.Employee1;

public class EmpOprs1 {

public List<Employee1> empList = new ArrayList<Employee1>();
	
	public EmpOprs1() {
		empList.add(new Employee1(101, "didul dulsara", 40000, "sales"));	
		empList.add(new Employee1(102, "thisal", 10000, "hr"));
		empList.add(new Employee1(103, "kisal", 10000, "marketing"));
		empList.add(new Employee1(104, "nithil", 10000, "it"));
	}	
	
	public List<Employee1> getAllEmployees(){
		return empList;
	}
	
	public List<Employee1> getEmployeeById(int id){
		List<Employee1> newList = empList.stream().filter(e->e.getId()==id).collect(Collectors.toList());
		return newList;
	}
	
	public List<Employee1> getEmployeeByName(String name){
		List<Employee1> newList = empList.stream().filter(e->e.getName().equals(name)).collect(Collectors.toList());
		return newList;
	}
	
	public List<Employee1> getEmployeeBySearchName(String searchString){
		List<Employee1> newList = empList.stream().filter(e->e.getName().contains(searchString)).collect(Collectors.toList());
		return newList;
	}
	
	public List<Employee1> getEmployeeByNameAndDepartment(String name, String department){
		List<Employee1> newList = empList.stream().filter(e->e.getName().equals(name)&&e.getDepartment().equals(department)).collect(Collectors.toList());
		return newList;
	}
	
	public List<Employee1> saveEmployee(Employee1 emp){
		empList.add(emp);
		return empList;
	}
	
	public List<Employee1> updateEmployee(Employee1 newEmp){
		List<Employee1> newList = new ArrayList<>();
		for(Employee1 oldEmp:empList){
			if(oldEmp.getId()!= newEmp.getId()){
				newList.add(oldEmp);
			}
		}
		newList.add(newEmp);
		empList = newList;
		return newList;
	}
	
	public List<Employee1> deleteEmployee(Employee1 newEmp){
		List<Employee1> newList = new ArrayList<>();
		for(Employee1 oldEmp:empList){
			if(oldEmp.getId()!= newEmp.getId()){
				newList.add(oldEmp);
			}
		}
		empList = newList;
		return newList;
	}
}
