<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/header_main.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#button {
		text-align: right;
	}
	
</style>
</head>
<body>
	<form action="board_free_write" method="post">
		<div class="mb-3">
			<label class="form-label">카테고리</label>
			<select class="form-control" name="category">
				<option value="자유">자유</option>
				<option value="후기">후기</option>
			</select>
		</div>
		<div class="mb-3">
			<label class="form-label">제목</label>
			<input type="text" class="form-control" name="subject">
		</div>
		<div class="mb-3">
			<label class="form-label">본문</label>
			<textarea class="form-control" rows="3" name="doc_body"></textarea>
		</div>
		<div class="mb-3" id="button">
			<input type="submit" value="작성" class="btn btn-outline-dark">
			<input type="button" value="취소" class="btn btn-outline-dark">
		</div>
	</form>
</body>
</html>