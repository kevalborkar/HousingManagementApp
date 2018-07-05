<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h1>Register Page</h1>
<form action="register.do" method="post">
	
	<table>
	<tr>
	<td>uniqueId</td>	<td><input type="text" name="uniqueId" required/></td>
	</tr>
	<tr>
	<td>firstName</td>	<td><input type="text" name="firstName" required/></td>
	</tr>
	<tr>
	<td>lastName</td>	<td><input type="text" name="lastName" required/></td>
	</tr>
	<tr>
	<td>gender</td>	<td><input type="radio" name="gender" value="male"required/>Male
						<input type="radio" name="gender" value="male"required/>Female
					</td>
	</tr>
	<tr>
	<td>age</td>	<td><input type="text" name="age" required/></td>
	</tr>
	<tr>
	<td>buildingNum</td>	<td><input type="text" name="buildingNum" required/></td>
	</tr>
	<tr>
	<td>floorNum</td>	<td><input type="text" name="floorNum" required/></td>
	</tr>
	<tr>
	<td>houseName</td>	<td><input type="text" name="houseName" required/></td>
	</tr>
	<tr>
	<td>contactNo</td>	<td><input type="text" name="contactNo" required/></td>
	</tr>
	<tr>
	<td>numOfCars</td>	<td><input type="text" name="numOfCars" required/></td>
	</tr>
	<tr>
	<td><input type="submit" value="Submit"/></td><td><input type="reset" value="Reset" /></td>
	</tr>
	</table>
 
</form>

</body>
</html>