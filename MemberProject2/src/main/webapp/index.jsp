<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>新增會員</h2>
<form action="AddMemberController.jsp" method="post">
名:<input type="text" name="name"><br>
帳號:<input type="text" name="username"><br>
密碼:<input type="text" name="password"><br>
地址:<input type="text" name="address"><br>
電話:<input type="text" name="phone"><br>
<input type="submit" value="送出">

</form>


<hr>
<h2>查詢會員</h2>
<a href="AllMemberController.jsp" target="_blank">查詢_String</a><br>
<a href="AllMemberController2" >查詢_list</a><br>
<hr>
<h2>修改會員</h2>
<form action="UpdateMember" method="post">
名:<input type="text" name="name"><br>
地址:<input type="text" name="address"><br>
id:<input type="text" name="id"><br>
<input type="submit" value="ok">
</form>
<hr>
<h2>刪除會員</h2>
<form action="DeleteMemberController" method="post">
id:<input type="text" name="id"><br>
<input type="submit" value="ok">
</form>
</body>
</html>