package com.webonise.entrapp.dao;

import java.sql.SQLException;

import com.mysql.jdbc.Statement;
import com.webonise.entrapp.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub

		ConnectionHelper myConnHelper = new ConnectionHelper();

		try {

			Statement statement = (Statement) myConnHelper.getConnection()
					.createStatement();

			String sql = "insert into Employee (Emp_id,Emp_name,Dept_id,Emp_DOB) values ("
					+ employee.getID()
					+ ",'"
					+ employee.getName()
					+ "', "
					+ employee.getDepartmentId()
					+ ",'"
					+ employee.getDateOfBirth() + "');";

			statement.executeUpdate(sql);
			statement.close();
			myConnHelper.getConnection().close();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
