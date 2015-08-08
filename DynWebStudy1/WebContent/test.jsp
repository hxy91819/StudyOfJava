<%@ page language="java" import="java.util.*, java.io.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hi-jsp实验</title>
</head>
<body>
	<!-- 注释的相关用法 -->
	<%-- 这是JSP注释，页面会忽略掉 --%>
	<%-- new java.util.Date(); --%>
	<!-- new java.util.Date(); -->
	<!--This page was loaded at <%= new java.util.Date() %> -->
	<% File file = new File("test.txt"); %>
	<h2>
		<%
			String msg = "This is a JSP test.";
			out.print("it will show in html!");//在html中显示变量值的方式
		%>
	</h2>
	<!-- 在html中显示变量值的方式 -->
	<h2><%=msg%></h2> 
	
	<h2>-------------------------</h2>
	
	<!-- JSP的声明 -->
	<%! int a = 3; %><!-- 这样定义是在成员变量的位置（这种方式用的很少） -->
	<% int b = 3; %><!-- 这样定义是在process方法的变量位置 -->
	<%=a-- %><br>
	<%=b-- %>
	
</body>
</html>