package com.api.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.demo1.model.Employee1;
import com.api.demo1.model.EmployeeResponse1;
import com.api.demo1.service.EmployeeService1;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/employee")
public class EmpController1 {
	
	@Autowired
	private EmployeeService1 service;
	
	@GetMapping("/getall")
	public List<Employee1> getAllEmployee(){
		return service.getAllEmp();
	}
	
	@GetMapping("/getbyid")
	public List<Employee1> getEmployeeById(@PathParam("id")int id){
		return service.findByEmpId(id);
	}
	
	@GetMapping("/getbyname")
	public List<Employee1> getEmployeeByName(@PathParam("name")String name){
		return service.findByEmpName(name);
	}
	
	@GetMapping("/getbykeyword")
	public List<Employee1> getEmployeeBySearchString(@PathParam("searchString")String searchString){
		return service.findBySearchString(searchString);
	}
	
	@GetMapping("/getbyname_and_dep")
	public List<Employee1> getEmployeeByNameAndDep(@PathParam("name")String name,@PathParam("department")String department){
		return service.findByNameAndDepartment(name,department);
	}
	
	@PostMapping("/save")
	public List<Employee1> saveEmp(@RequestBody Employee1 emp){
		return service.saveEmployee(emp);
	}
	
	@PutMapping("/update")
	public List<Employee1> updateEmp(@RequestBody Employee1 emp){
		return service.updateEmployee(emp);
	}
	
	@DeleteMapping("/delete")
	public List<Employee1> deleteEmp(@RequestBody Employee1 emp){
		return service.deleteEmployee(emp);
	}
	
	@GetMapping("/getall/api")
	public EmployeeResponse1 getAllEmp(@RequestHeader("apikey") String apikey){
		EmployeeResponse1 res = new EmployeeResponse1();
		if(apikey.equals("12345678abcdefgh")){
			res.setStatus("Success");
			res.setMessage("");
			res.setData(service.getAllEmp());
			return res;
		}else{
			res.setStatus("Failed");
			res.setMessage("Invalid api key");
			return res;
		}
	}
}
