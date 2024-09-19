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
	<div>
		<ul>
			<li>공지 게시판</li>
			<li>추천 게시판</li>
			<li onclick="location.href='/board_free_list'">자유 게시판</li>
			<li>질문 게시판</li>
		</ul>
		
		<button onclick="location.href='/logout'">로그아웃</button>
	</div>
</body>
</html>