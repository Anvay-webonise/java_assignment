package com.webonise.entrapp.service;

import com.webonise.entrapp.dao.EmployeeDao;
import com.webonise.entrapp.dao.EmployeeDaoImpl;
import com.webonise.entrapp.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao employeeDao = new EmployeeDaoImpl();

	@Override
	public void addEmployee(Employee employee) {

		employeeDao.addEmployee(employee);
	}
}
