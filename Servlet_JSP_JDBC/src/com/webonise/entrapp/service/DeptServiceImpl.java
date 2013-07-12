package com.webonise.entrapp.service;

import java.util.ArrayList;
import com.webonise.entrapp.dao.DeptDao;
import com.webonise.entrapp.dao.DeptDaoImpl;

public class DeptServiceImpl implements DeptService {

	DeptDao deptDao = new DeptDaoImpl();

	@Override
	public ArrayList<String> getDeptId() {
		// TODO Auto-generated method stub

		;
		return deptDao.getDeptId();

	}

}
