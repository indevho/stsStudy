<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form/buyOrderComplete</title>
</head>
<body>
<h1>form/buyOrderComplete</h1>
	<table border="">
		<tr>
			<td>번호</td><td>id</td><td>이름</td><td>갯수</td>
		</tr>
<c:forEach items="${buyOrder.prod }" var="pp" varStatus="no">		
		<tr>
			<td>${no.index }</td>
			<td>${pp.pid}</td>
			<td>${pp.pname}</td>
			<td>${pp.cnt}</td>
		</tr>
</c:forEach>
		<tr>
			<td rowspan="3">주소</td>
			<td >우편번호</td>
			<td colspan="2">
				${buyOrder.addr.zipcode}
			</td>
		</tr>
		<tr>
			<td >기본주소</td>
			<td colspan="2">
				${buyOrder.addr.addr1}
			</td>
		</tr>
		<tr>
			<td >상세주소</td>
			<td colspan="2">
				${buyOrder.addr.addr2}
			</td>
		</tr>			
	</table>

</body>
</html>