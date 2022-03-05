<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
		<div class="container">
			<h2>REGISTER</h2>
			<form method="post">
				<input type="text" class="form-control"
					placeholder="Enter username" name="username" required> <input
					type="password" class="form-control" placeholder="Enter password"
					name="pwd" required>
				<input type="submit" class="btn btn-outline-dark"
					style="margin-top: 1%">
			
			</form>
	

	<%
	String user = request.getParameter("username");
	String pass = request.getParameter("pwd");
	out.println(user);
	out.println(pass);
	%>
	</div>

</body>
</html>