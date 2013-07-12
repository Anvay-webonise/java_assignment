<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<center>
		<form name="Form1" action="Operation.jsp" method="get">
			<table>
				<tr>
					<td><B>SELECT YOUR CHOICE</B></td>
				</tr>
				<tr>

					<td><input type="radio" name="no" value="employee">Insert
						In Employee</td>
				</tr>
				<tr>
					<td><input type="radio" name="no" value="department">Insert
						In Department</td>
				</tr>

			</table>
			<input type=submit value="Submit">
		</form>
	</center>
</body>
</html>