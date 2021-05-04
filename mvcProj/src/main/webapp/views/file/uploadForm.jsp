<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>file/upload</title>
</head>
<body>
<h1>file/upload</h1>
<h2>전송1</h2>
<form action="complete1" method="post" enctype="multipart/form-data">
<table border="">
	<tr>
		<td>이름</td>
		<td><input type="text" name="pname" /></td>
	</tr>
	<tr>
		<td>나이1</td>
		<td><input type="text" name="age" /></td>
	</tr>
	<tr>
		<td>파일1</td>
		<td><input type="file" name="upfile1" /></td>
	</tr>
	<tr>
		<td>파일2</td>
		<td><input type="file" name="upfile2" /></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="입력1" /></td>
	</tr>
</table>
</form>

<h2>전송2</h2>
<form action="complete2" method="post" enctype="multipart/form-data">
<table border="">
	<tr>
		<td>이름</td>
		<td><input type="text" name="pname" /></td>
	</tr>
	<tr>
		<td>나이1</td>
		<td><input type="text" name="age" /></td>
	</tr>
	<tr>
		<td>파일1</td>
		<td><input type="file" name="upfile1" /></td>
	</tr>
	<tr>
		<td>파일2</td>
		<td><input type="file" name="upfile2" /></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="입력2" /></td>
	</tr>
</table>
</form>
<h2>전송3</h2>
<form action="complete3" method="post" enctype="multipart/form-data">
<table border="">
	<tr>
		<td>이름</td>
		<td><input type="text" name="pname" /></td>
	</tr>
	<tr>
		<td>나이1</td>
		<td><input type="text" name="age" /></td>
	</tr>
	<tr>
		<td>파일1</td>
		<td><input type="file" name="upfile1" /></td>
	</tr>
	<tr>
		<td>파일2</td>
		<td><input type="file" name="upfile2" /></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="입력3" /></td>
	</tr>
</table>
</form>
</body>
</html>