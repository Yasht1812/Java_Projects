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
int n = 5;
int fact = 1; 
for(int i = 1 ; i<= n ; i++){
	fact = fact * i ; 
}
out.println("The factorial is :"+fact);
%>

</body>
</html>