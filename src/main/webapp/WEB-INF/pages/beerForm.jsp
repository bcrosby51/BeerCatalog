<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC Form Handling</title>
</head>
<body>
	<h2>Beer Catalog Form</h2>
	<mvc:form modelAttribute="beer" action="result.mvc">
		<table>
			<tr>
				<td><mvc:label path="name">Name</mvc:label></td>
				<td><mvc:input path="name" /></td>
			</tr>
			<tr>
				<td><mvc:label path="brewery">Brewery</mvc:label></td>
				<td><mvc:input path="brewery" /></td>
			</tr>
			<tr>
				<td><mvc:label path="abv">ABV%</mvc:label></td>
				<td><mvc:input path="abv" /></td>
			</tr>
			<tr>
				<td><mvc:label path="description">Description</mvc:label></td>
				<td><mvc:textarea path="description" /></td>
			</tr>
			<tr>
				<td><mvc:label path="type">Beer Type</mvc:label></td>
				<td><mvc:select path="type" items="${beertypes}" /></td>
			</tr>
			<tr>
				<td><mvc:label path="origincountry">Country of Origin</mvc:label></td>
				<td><mvc:select path="origincountry" items="${countries}" /></td>
			</tr>
			<tr>
				<td><mvc:label path="cellarable">Cellarable</mvc:label></td>
				<td><mvc:checkbox path="cellarable" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</mvc:form>
	<a href="viewAll.mvc">View all Beers</a>
</body>
</html>