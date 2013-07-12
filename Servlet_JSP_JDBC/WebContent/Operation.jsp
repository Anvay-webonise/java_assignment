<%@page import="sun.org.mozilla.javascript.internal.ast.WhileLoop"%>
<%@page import="com.webonise.entrapp.dao.ConnectionHelper"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.mysql.jdbc.Statement"
	import="com.mysql.jdbc.ResultSet" import="java.util.ArrayList"%>
<%
	String radioButton = request.getParameter("no");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Operation</title>
</head>
<body>
	<%
		//The following code is to take data which is comming from databse and display on jsp pages
		RequestDispatcher dis = request
				.getRequestDispatcher("/Servletoperation");
		dis.include(request, response);
		String list[] = (String[]) request.getAttribute("myList");
	%>

	<center>
		<%
			if (radioButton.equals("employee")) {
		%>
		<form name="Form1" method="post" action="Servletoperation">
			<table>
				<tr>
					<td><B>Employee Id : </B></td>
					<td><input type="text" name="id" size="25" value=""></td>
				</tr>
				<tr>
					<td><B>Employee Name : </B></td>
					<td><input type="text" name="name" size="25" value=""></td>
				</tr>
				<tr>

					<td><B>Department Id : </B></td>
					<td><select name="did">
							<%
								for (int i = 0; i < list.length; i++) {
										String s = list[i];
							%>
							<option value="<%=s%>">
								<%=s%>
							</option>
							<%
								}
							%>
					</select></td>
				</tr>
				<tr>
					<td><B>Employee DOB :</B></td>
					<td><input type="text" name="dob" size="25" value=""></td>
				</tr>
			</table>
			<input type="hidden" name="radio" value="employee"> <input
				type=submit value="Submit">
		</form>

		<%
			}
			if (radioButton.equals("department")) {
		%>
		<form name="Form1" method="post" action="Servletoperation">
			<table>
				<tr>
					<td><B>Department Id : </B></td>
					<td><input type="text" name="id" size="25" value=""></td>
				</tr>
				<tr>
					<td><B>Department Name :</B></td>
					<td><input type="text" name="name" size="25" value=""></td>
				</tr>
			</table>
			<input type="hidden" name="radio" value="department"> <input
				type=submit value="Submit">
		</form>
		<%
			}
		%>

	</center>
</body>
</html>