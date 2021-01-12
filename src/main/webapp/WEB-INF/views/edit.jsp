<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit User</title>
</head>
<body>
	<form method="post" action="/edit">
	
		Id: <input type="text" name="id" value=${user.getId()} readonly="readonly">
		Name: <input type="text" name="name" value=${user.getName()}>
		<button type="submit">Save</button> 
		<button>Cancel</button> 
	</form>
</body>
</html>