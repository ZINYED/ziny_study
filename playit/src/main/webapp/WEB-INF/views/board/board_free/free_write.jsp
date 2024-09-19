<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/header_main.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	
	
</style>
</head>
<body>
	<form action="board_free_write" method="post">
		<div class="mb-3">
			<label class="form-label">제목</label>
			<input type="email" class="form-control">
		</div>
		<div class="mb-3">
			<label class="form-label">본문</label>
			<textarea class="form-control" rows="3"></textarea>
		</div>	
	</form>
</body>
</html>