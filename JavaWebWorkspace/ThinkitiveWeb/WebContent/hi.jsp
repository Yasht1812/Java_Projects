<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Integer counter = 0;
HttpSession session1 = request.getSession();// Open session if exists else create new
counter = (Integer) session1.getAttribute("count");
if (counter!= null) {
	counter++;
	session1.setAttribute("count", counter);// you can share any data using session also
} else {
	counter = 0;
	counter++;
	session1.setAttribute("count", counter);
	
}
response.getWriter().println("Hi no of count: "+counter);
%>

</body>
</html>