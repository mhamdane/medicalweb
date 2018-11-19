<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>
<title>:: Medical Web ::</title>
</head>
<body>
	<h1>Medical Web Access</h1>
	<hr>
	<div class="form">
		<form action="login" method="post" onsubmit="return validate()">
			<table>
				<tr>
					<td>Username:</td>
					<td><input id="uname" name="uname" type="text"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input id="pwd" name="pwd" type="password"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login"></td>
					<td><input type="reset" value="Reset"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>