<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form/buyOrderForm</title>
</head>
<body>
<h1>form/buyOrderForm</h1>

<form action="" method="post">
	<table border="">
		<tr>
			<td>번호</td><td>id</td><td>이름</td><td>갯수</td>
			
		</tr>
<c:forEach begin="0" end="4" var="i" >		
		<tr>
			<td>${i }</td>
			<td><input type="text" name="prod[${i }].pid" /></td>
			<td><input type="text" name="prod[${i }].pname" /></td>
			<td><input type="text" name="prod[${i }].cnt" /></td>
		</tr>
</c:forEach>
		<tr>
			<td rowspan="3">주소</td>
			<td >우편번호</td>
			<td colspan="2">
				<input type="text" name="addr.zipcode" />
			</td>
		</tr>
		<tr>
			<td >기본주소</td>
			<td colspan="2">
				<input type="text" name="addr.addr1" />
			</td>
		</tr>
		<tr>
			<td >상세주소</td>
			<td colspan="2">
				<input type="text" name="addr.addr2" />
			</td>
		</tr>			
		<tr>
			<td colspan="4" >
				<input type="submit" value="입력" />
			</td>
		</tr>
	</table>
</form>
</body>
</html>