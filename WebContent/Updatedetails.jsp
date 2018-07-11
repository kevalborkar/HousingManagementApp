<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Details</title>
</head>
<body>
	<h2>Update Details</h2>
	<fieldset>
	<legend>Update Details</legend>
	<form action="updatedetails.do" method="post">
		<h3>${ msg }</h3>
		<table>
			<tr>
				<td>Contact No</td>
				<td><input type="text" name="contactNo" value="${contactNo}"/></td>
				
			</tr>
			<tr>
				<td>New Car number</td>
				<td><input type="text" name="newCarNum" value="${numOfCars}"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="Submit" value="Submit" /></td>
			</tr>
		
		</table>
	
	</form>
	</fieldset>
</body>
</html>