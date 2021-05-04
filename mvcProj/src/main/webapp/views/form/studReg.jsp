<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form/studReg</title>
</head>
<body>
<h1>form/studReg</h1>

	<table border="">
		<tr>
			<td>이름</td>
			<td>${stud.pname }</td>
		</tr>
<c:forEach var="j" items="${stud.jum }" varStatus="no">
		<tr>
			<td>${stud.title[no.index] }</td>
			<td>${j }</td>
		</tr>

</c:forEach>		
		
		<tr>
			<td>총점</td>
			<td>${stud.tot }</td>
		</tr>
		<tr>
			<td>평균</td>
			<td>${stud.avg }</td>
		</tr>
		<tr>
			<td>등급</td>
			<td>${stud.grade }</td>
		</tr>
	</table>



</body>
</html>