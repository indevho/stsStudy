<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form/stud</title>
</head>
<body>
<h1>form/stud</h1>

<form action="" method="post">
	<table border="">
		<tr>
			<td>이름</td>
			<td><input type="text" name="pname" /></td>
		</tr>
<c:forEach items="${st.title }" var="tt">		
		<tr>
			<td>${tt }</td>
			<td><input type="text" name="jum" /></td>
		</tr>
</c:forEach>		
		<tr>
			<td colspan="2" >
				<input type="submit" value="입력" />
			</td>
		</tr>
	</table>
</form>


</body>
</html>