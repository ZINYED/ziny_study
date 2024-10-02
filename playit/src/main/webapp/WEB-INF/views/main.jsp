<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/header_main.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

</script>
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
</body>
</html>