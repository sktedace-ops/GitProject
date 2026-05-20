
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="model.Member"
    import="dao.impl.MemberDaoImpl"%>
    
<%
String Name=request.getParameter("name");
String UserName=request.getParameter("username");
String Password=request.getParameter("password");
String Address=request.getParameter("address");
String Phone=request.getParameter("phone");

Member member=new Member(Name,UserName,Password,Address,Phone);
new MemberDaoImpl().addMember(member);


%>       

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
新增成功
<a href="index.jsp">回首頁</a>
</body>
</html>