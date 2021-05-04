<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>springMvcProj</h1>
${data }
<h2>request</h2>
<h2>""
<a href="<c:url value="/form/join"/>">join</a>&nbsp;&nbsp;
<a href="<c:url value="/form/stud"/>">stud</a>&nbsp;&nbsp;
<a href="<c:url value="/form/buyOrder"/>">buyOrder</a>&nbsp;&nbsp;
<a href="<c:url value="/form/exForm"/>">exForm</a>&nbsp;&nbsp;
<a href="<c:url value="/file/upload"/>">file/upload</a>&nbsp;&nbsp;
<br>
</h2>
</body>
</html>