<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homework2</title>
</head>
<body>
	<form action="Register" method="post">
		<table>
			<tr><td>Product Barcode: </td><td><input type="text" name="pbar"></td></tr>
			<tr><td>Product Name: </td><td><input type="text" name="pname"></td></tr>
			<tr><td>Product Color: </td><td><input type="text" name="pcolor"></td></tr>
			<tr><td>Product Description: </td><td><input type="text" name="pdesc"></td></tr>
			<tr><td></td><td><input type="submit" value="submit"></td></tr>
		</table>
	</form>
	
<a href="query" method="get">Display Database</a>

</body>
</html>
