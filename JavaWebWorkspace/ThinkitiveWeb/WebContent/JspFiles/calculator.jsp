<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/WEB-INF/calc.tld" prefix="my"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
<input type="number" name="data"><br>
<input type="number" name="data1"><br>
<input type="submit">
</form>
<%!
Integer i=0;
Integer j=0;
%>
<%
i=Integer.parseInt(request.getParameter("data"));
j=Integer.parseInt(request.getParameter("data1"));
if(i==null)
	i=0;
if(j==null)
	j=0;
%>

</body>
</html>