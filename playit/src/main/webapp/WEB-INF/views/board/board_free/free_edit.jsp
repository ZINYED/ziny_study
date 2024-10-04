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
	<!-- 상단 내비게이션 바 -->
	<nav class="navbar navbar-expand-lg bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">PLAYIT</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse d-flex justify-content-between" id="navbarNavAltMarkup">
				<div class="navbar-nav">
					<a class="nav-link" href="#">공지</a>
					<a class="nav-link" href="#">추천</a>
					<a class="nav-link" href="/board_free_list">자유</a>
					<a class="nav-link" href="#">질문</a>
				</div>
				<div>
					<button class="btn btn-outline-secondary">My Page</button>
					<button class="btn btn-outline-secondary" onclick="location.href='/logout'">로그아웃</button>
				</div>
			</div>
		</div>
	</nav>
	
	<!-- 본문 -->
	<form action="board_free_write" method="post" enctype="multipart/form-data">
		<div class="mb-3">
			<label class="form-label">카테고리</label>
			<select class="form-control" name="category">
				<option value="자유">자유</option>
				<option value="후기">후기</option>
			</select>
		</div>
		<div class="mb-3">
			<label class="form-label">제목</label>
			<input type="text" class="form-control" name="subject" required="required" value="${freeContent.subject }">
		</div>
		<div class="mb-3">
			<label class="col-form-label">첨부파일</label>
			<input type="file" class="form-control form-control-sm" id="file" name="file1">
			<label class="custom-file-label" for="file"></label>
		</div>
		<div class="mb-3">
			<label class="form-label">본문</label>
			<textarea class="form-control" rows="3" name="doc_body" required></textarea>
		</div>
		<div class="mb-3" id="button">
			<input type="submit" value="작성" class="btn btn-outline-dark">
			<input type="button" value="취소" class="btn btn-outline-dark" onclick="history.back()">
		</div>
	</form>
</body>
</html>