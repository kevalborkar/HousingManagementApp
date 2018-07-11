<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1>Login Page</h1>
	
	<fieldset>
	<legend>Login</legend>
		<h2>${msg}</h2>
		<form action="login.do" method="post">
			<table>
				<tr>
					<td>contactNo</td>
					<td><input type="number" name="contactNo" required/></td>
				</tr>
				<tr>
					<td>uniqueId</td>
					<td><input type="password" name="uniqueId" required/></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Submit"/>
						<input type="reset" value="Reset" /></td>
				</tr>
				<tr>
					<td>Forget Password</td>
					<td><a href="ChangePassword.jsp">Click Here...</a></td>
					
				</tr>
				<tr>
					<td>New User?</td>
					<td><a href="Register.jsp">Register Here...</a></td>
					
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>