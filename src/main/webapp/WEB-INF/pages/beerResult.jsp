<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirmation</title>
</head>
<body>
	<h2>Beer Added to Catalog</h2>
	<table>
		<tr>
			<td>Name</td>
			<td>${b.name}</td>
		</tr>
		<tr>
			<td>Brewery</td>
			<td>${b.brewery}</td>
		</tr>
		<tr>
			<td>ABV%</td>
			<td>${b.abv}</td>
		</tr>
		<tr>
			<td>Description</td>
			<td>${b.description}</td>
		</tr>
		<tr>
			<td>Beer Type</td>
			<td>${b.type}</td>
		</tr>
		<tr>
			<td>Country or Origin</td>
			<td>${b.origincountry}</td>
		</tr>
		<tr>
			<td>Cellarable?</td>
			<td>${b.cellarable}</td>
		</tr>
	</table>
	<a href="form.mvc">Add a new Beer</a>
	<a href="viewAll.mvc">View all Beers</a>
</body>

</html>