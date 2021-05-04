<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exRes</title>
</head>
<body>
<h3>결과화면</h3>
		${studArr.stdarr[0].pname }
<table border="">
	<tr>
		<%-- 	<c:forEach var="i" begin="1" end="${subs }" step="1">
				<td><input type="text" name="stdarr[${num }].jum" /></td>
			</c:forEach>
		<c:forEach var="sub" items="${std.title }">
			<td>${sub }</td>
		</c:forEach> --%>
		
		<c:forEach  var="dd" items="${studArr.stdarr}"  >
			<tr>
				<td> ${dd }  </td>
				
			</tr>
		
		</c:forEach>
	</tr>
	
	<tr>
	
		<c:forEach  var="dd" items="${studArr.stset}"  >
			<tr>
				<td> ${dd }  </td>
				
			</tr>
		
		</c:forEach>
	
	</tr>

</table>




</body>
</html>