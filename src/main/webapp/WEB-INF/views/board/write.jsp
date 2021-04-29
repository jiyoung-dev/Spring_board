<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 작성</title>
</head>
<body>
	<h2>게시물 작성화면 입니다</h2>
	<form method="post">
	
	<table>
	<tr>
		<td><label>제목</label></td>
		<td><input type="text" name="title" /></td><br />
	<tr>
	<tr>
		<td><label>작성자</label></td>
		<td><input type="text" name="writer" /></td><br />
	</tr>
	<tr>
		<td><label>내용</label></td>
		<td><textarea cols="50" rows="5" name="content"></textarea></td>
	</tr>
	<td><button type="submit">작성</button></td>
	</table>
	
	</form>
</body>
</html>