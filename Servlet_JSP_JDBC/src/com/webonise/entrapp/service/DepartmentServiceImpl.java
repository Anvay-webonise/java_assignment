package com.webonise.entrapp.service;

import com.webonise.entrapp.dao.DepartmentDao;
import com.webonise.entrapp.dao.DepartmentDaoImpl;
import com.webonise.entrapp.model.Department;

public class DepartmentServiceImpl implements DepartmentService {

	DepartmentDao departmentDao = new DepartmentDaoImpl();

	@Override
	public void addDepartment(Department department) {
		// TODO Auto-generated method stub

		departmentDao.addDepartment(department);

	}
}
