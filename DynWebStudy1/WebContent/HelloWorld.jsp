<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World Of Jsp : <%= new Date().toLocaleString() %></h1>
    
    <!-- JSP中的Java代码可以与Html组合嵌套 -->
    <%
            for(int i = 0; i < 2; i ++){
        %>
        你好<br>
    <% }%>
</body>
</html>