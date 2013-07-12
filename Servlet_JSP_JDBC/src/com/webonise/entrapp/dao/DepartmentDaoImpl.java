package com.webonise.entrapp.dao;

import java.sql.SQLException;
import com.mysql.jdbc.Statement;
import com.webonise.entrapp.model.Department;

public class DepartmentDaoImpl implements DepartmentDao {

	@Override
	public void addDepartment(Department department) {
		// TODO Auto-generated method stub

		ConnectionHelper myConnHelper = new ConnectionHelper();

		try {

			Statement statement = (Statement) myConnHelper.getConnection()
					.createStatement();

			String sql = "insert into Department (Dept_id,Dept_name) values ("
					+ department.getId() + ",'" + department.getName() + "');";

			statement.executeUpdate(sql);
			statement.close();
			myConnHelper.getConnection().close();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
