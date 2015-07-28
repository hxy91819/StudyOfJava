<%@page import="com.hxy.icsLogConvert.SqlConvertor"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>转换后的SQL</title>
</head>
<body>

	<%
	    String sqlString = request.getParameter("ICSSQL");
	    /* sqlString = URLDecoder.decode(sqlString, "UTF-8"); */
	    sqlString=new String(sqlString.getBytes("ISO-8859-1"),"UTF-8");
	    String resultSQL = SqlConvertor.getSQL(sqlString);
	    System.out.println(resultSQL);
	%>
	<h4>--转换结果如下：</h4>
	<pre><%=resultSQL%></pre>
</body>
</html>