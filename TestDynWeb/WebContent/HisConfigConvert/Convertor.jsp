<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>转换XML为ETF XML</title>
</head>
<body>
    <form action="HisConfigConvertorServlet" method="post">
        <h4>请输入待转换的XML</h4>
        <textarea rows="20" cols="80" name="inputXML"></textarea>
        <br /> <input type="submit" value="提交" />&nbsp;&nbsp;&nbsp; <input type="reset" value="重置" />
    </form>
</body>
</html>