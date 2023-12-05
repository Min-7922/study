<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Hello, JSP</h1>
<hr>

<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!-- 자바의 import와 같은 부분 -->


<%
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
	String now = sdf.format(new Date());
	
	out.println("<h3>지금은"+ now +"입니다.</h3>"); 
	// 아래와 같은 코드!
%>

<h3>지금은 <%=now %>입니다.</h3>

</body>
</html>

<!-- html베이스에 중간중간에 자바코드를 넣음 = jsp -->
<!-- jsp : java server page -->