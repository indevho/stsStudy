<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>file/com_3</title>
</head>
<body>
<h1>file/com_3</h1>
<h2>전송3</h2>

<table border="">
	<tr>
		<td>이름</td>
		<td>${member.pname }</td>
	</tr>
	<tr>
		<td>나이1</td>
		<td>${member.age }</td>
	</tr>
	<tr>
		<td>파일1</td>
		<%-- <td>${param.upfile1 }</td> --%>
		<td>${member.upfile1.originalFilename }:모델이직접주는이름</td>
		<!-- mf 자료형. 클래스 내에 getFilename, getOriginalFilename 있는거에 착아해서
		그냥 가져와버리기 ;;; 이게 된다.  -->
	</tr>
	<tr>
		<td>파일2</td>
		<%-- <td>${param.upfile2 }</td> --%>
		<td>${member.up2 }</td>
		<!-- up2로 하고 싶다면  -->
	</tr>
</table>

</body>
</html>