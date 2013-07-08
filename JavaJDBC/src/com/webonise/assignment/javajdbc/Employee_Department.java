package com.webonise.assignment.javajdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Anvay class created for demo of JDBC
 *
 */
public class Employee_Department {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader( //buffered reader to take input from user
					System.in));
			Class.forName("com.mysql.jdbc.Driver"); //register driver

			java.sql.Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost/test_java", "webonise", ""); //create connection

			while (true) {

				System.out.println("");
				System.out.println("");
				System.out
						.println("1)Display DATABASE 2)Insert Into DATABASE 3)Query on DATABASE 4)exit");
				System.out.println("Enter your choice : ");//Display main menu
				int ch = Integer.parseInt(br.readLine());

				switch (ch) {

				case 1: {
					try {
						java.sql.Statement stmt = con.createStatement();

						String sql;
						int flag;
						System.out.println("");
						System.out
								.println("Enter Table no 1)Employee 2)Department : "); //select choice from employee or department for data display
						flag = Integer.parseInt(br.readLine());

						if (flag == 1) { //select data from employee table;
							sql = "SELECT * FROM Employee";
							java.sql.ResultSet rs = stmt.executeQuery(sql);

							while (rs.next()) {

								int id = rs.getInt("Emp_id");
								String name = rs.getString("Emp_name");
								int did = rs.getInt("Dept_id");
								Date dob = rs.getDate("Emp_DOB");
								System.out.println("");
								System.out.print("Employee ID : " + id);
								System.out.print(" Employee name : " + name);
								System.out.print(" Department ID : " + did);
								System.out.print(" Employee DOB : " + dob);
							}
							rs.close();
						}

						else {//select data from department table
							sql = "SELECT * FROM Department";
							java.sql.ResultSet rs = stmt.executeQuery(sql);

							while (rs.next()) {

								int id = rs.getInt("Dept_id");
								String name = rs.getString("Dept_name");
								System.out.println("");
								System.out.print("Department ID : " + id);
								System.out.print(" Department name : " + name);

							}
							rs.close();
						}
						stmt.close();

						break;
					} catch (SQLException e) {
						System.out
								.print("The Exception occour during Select query");
					}
				}
				case 2: {

					try {

						java.sql.Statement stmt = con.createStatement();

						String sql, name;
						int id, flag, did;
						Date dob;

						System.out.println("");
						System.out
								.println("To Insert Enter Table no 1)Employee 2)Department : "); //insert in to employee or department
						flag = Integer.parseInt(br.readLine());

						if (flag == 1) { //insert data in employee table

							System.out.println("Enter employee id : ");
							id = Integer.parseInt(br.readLine());

							System.out.println("Enter employee name : ");
							name = br.readLine();

							System.out
									.println("Enter employee department id : ");
							did = Integer.parseInt(br.readLine());

							System.out
									.println("Enter employee DOB (yyyy-mm-dd) : ");
							dob = Date.valueOf(br.readLine());

							sql = "insert into Employee (Emp_id,Emp_name,Dept_id,Emp_DOB) values ("
									+ id
									+ ",'"
									+ name
									+ "', "
									+ did
									+ ",'"
									+ dob + "');";

							System.out
									.println("Data Is Inserted Successfully : ");

							stmt.executeUpdate(sql);
							stmt.close();
						}

						else { //insert data in department table

							System.out.println("Enter department id : ");
							id = Integer.parseInt(br.readLine());

							System.out.println("Enter department name : ");
							name = br.readLine();

							sql = "insert into Department (Dept_id,Dept_name) values ("
									+ id + ",'" + name + "');";

							System.out
									.println("Data Is Inserted Successfully : ");

							stmt.executeUpdate(sql);
							stmt.close();

						}

						break;
					} catch (SQLException e) {
						System.out
								.print("Exception occour in inserting data : ");
					}
				}

				case 3: {

					try {
						java.sql.Statement stmt = con.createStatement();
						
						System.out.println("");
						System.out
								.println("1)Department and count of employee in that department");
						System.out.println("2)Employee with same DOB");
						System.out.println("Enter your choice : "); //select 1st or 2nd query
						int flag;
						flag = Integer.parseInt(br.readLine());

						if (flag == 1) { //select the no of employee per department
							String sql = "SELECT d.Dept_id,d.Dept_name,count(e.Dept_id) from Department d left outer join Employee e on e.Dept_id=d.Dept_id group by d.Dept_id;";
							java.sql.ResultSet rs = stmt.executeQuery(sql);

							while (rs.next()) {

								int id = rs.getInt(1);
								String name = rs.getString(2);
								int count = rs.getInt(3);
								System.out.println("");
								System.out.print("Department ID : " + id);
								System.out.print(" Department name : " + name);
								System.out.print(" Count : " + count);
							}

							rs.close();
						} else { //select employee with same DOB

							Date dob;

							System.out.println("Enter DOB : ");
							dob = Date.valueOf(br.readLine());

							String sql = "select * from Employee where Emp_DOB='"
									+ dob + "';";
							java.sql.ResultSet rs = stmt.executeQuery(sql);

							while (rs.next()) {

								int id = rs.getInt("Emp_id");
								String name = rs.getString("Emp_name");
								int did = rs.getInt("Dept_id");
								Date dob1 = rs.getDate("Emp_DOB");
								System.out.println("");
								System.out.print("Employee ID : " + id);
								System.out.print(" Employee name : " + name);
								System.out.print(" Department ID : " + did);
								System.out.print(" Employee DOB : " + dob1);
							}
							rs.close();

						}
						break;
					} catch (SQLException e) {
						System.out
								.println("Exception in selection of query : ");
					}
				}

				case 4: { //all connection are close and system is exiting
					con.close();
					System.out.print("System is off : ");
					System.exit(0);
				}
				}
			}
		} catch (SQLException e) {

			System.out.println("Exception in connection : ");
		} catch (Exception e) {
			System.out.println("Exception occour in buffered reader : ");
		}
	}
}
