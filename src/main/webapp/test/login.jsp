<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/loginProcess" method="post">
		아이디  <input type="text" name="userId"><br>
		비밀번호<input type="password" name="pass"><br>
			 <input type="submit" value="로그인"><br>
	</form>
</body>
</html>