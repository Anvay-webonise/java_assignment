package com.webonise.entrapp.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class DeptDaoImpl implements DeptDao {

	@Override
	public ArrayList<String> getDeptId() {

		ConnectionHelper myConnHelper = new ConnectionHelper();
		ArrayList<String> myList = new ArrayList<String>();
		try {

			Statement statement = (Statement) myConnHelper.getConnection()
					.createStatement();

			String sql = "Select Dept_id FROM Department;";
			ResultSet rs = (ResultSet) statement.executeQuery(sql);

			while (rs.next()) {

				String s = rs.getString(1);
				myList.add(s);
			}

			rs.close();
			statement.close();
			myConnHelper.getConnection().close();

			// return myList;

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return myList;

	}

}
