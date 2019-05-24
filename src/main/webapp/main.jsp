<%@page import="kr.or.ddit.UserVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2><%=((UserVo)session.getAttribute("SESSION_USER")).getName()%>  </h2>
	메인 입니다. 20190524
	
</body>
</html>