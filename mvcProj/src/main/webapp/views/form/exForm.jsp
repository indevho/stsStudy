<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ExamForm</title>
</head>
<body>
<h3>ExamForm</h3>

<form action="" method="post">
<table border="">
	<tr>
		<td>이름</td>
		<c:forEach var="sub" items="${std.title }">
			<td>${sub }</td>
		</c:forEach>
	
	</tr>
	
	<c:forEach var="num" begin="0" end="5" step="1">
		<tr>
			<td>
			<input type="text" name="stdarr[${num}].pname"/>
			</td>
			
			<c:forEach var="i" begin="1" end="${subs }" step="1">
				<td><input type="text" name="stdarr[${num }].jum" /></td>
			</c:forEach>
		
		</tr>
		
	</c:forEach>
		<tr><!--과목수+1  -->
			<td colspan="${subs+1 }">
				<input type="submit" value="입력완료" />
			</td>
		</tr>
	





</table>



</form>




</body>
</html>