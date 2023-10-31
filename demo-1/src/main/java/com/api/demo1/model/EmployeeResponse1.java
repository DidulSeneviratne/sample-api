package com.api.demo1.model;

import java.util.List;

public class EmployeeResponse1 {
	public String status;
	public String message;
	public List<Employee1> data;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Employee1> getData() {
		return data;
	}
	public void setData(List<Employee1> data) {
		this.data = data;
	}
	
}
