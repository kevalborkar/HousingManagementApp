<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password</title>
</head>
<body>
	
	<h1>Change Password</h1>
	
	<fieldset>
	<legend>Change Password</legend>
	<form action="changepass.do" method="post">
		<h2> ${ msg }</h2>
		<table>
			<tr>
			<td>Contact Number</td>
			<td><input type="text" name="contactNo" required placeholder="Enter Contact No "/></td>
			</tr>
			<tr>
			<td>New Unique Id</td>
			<td><input type="password" name="newuniqueId" required placeholder="Enter New UniqueId "/></td>
			</tr>
			<tr>
			<td></td>
			<td>
				<input type="submit" value="Submit"/>
				<input type="reset" value="Reset"/>
			</td>
			</tr>
		</table>
	
	</form>
	
	</fieldset>
	
	
</body>
</html>