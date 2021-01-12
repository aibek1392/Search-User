<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Saved page</title>
</head>
<body>
	<table border='1' style="width: 40%">
		<tr>
			<th>Id</th>
			<th>Name</th>
		</tr>
		<tr style="text-align:center">
			
			<td>${user.getId()}</td>
			<td>${user.getName()}</td>
		</tr>
		
	</table>
	<button> <a href="/edit?id=${user.getId()}">Edit</a></button>
		<button> <a href="/search">Go Back</a></button>


</body>
</html>