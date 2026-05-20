<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="dao.impl.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
out.println("<table width=600 align=center border=1>"+new MemberDaoImpl().selectAllMember1()+"</table>");
%>
</body>
</html>