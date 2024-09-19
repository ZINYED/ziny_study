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
	<h6 id="total">총 건수 : ${freeTotal} </h6>
	<button onclick="location.href='/board_free_write_form'">작성</button>
	<table class="table" id="freeList">
 		<thead>
			<tr>
				<th>번호</th><th>게시종류</th><th>제목</th><th>작성자</th><th>작성일</th><th>수정일</th><th>조회</th><th>추천</th>
			</tr>
		</thead>
		<tbody class="table-group-divider">
			<c:forEach var="free" items="${freeList }" varStatus="status">
				<tr>
					<td>${status.count}</td>
					<td>${free.category}</td>
					<td>${free.subject}</td>
					<td>${free.user_nick}</td>
					<td><fmt:formatDate value="${free.create_date}" pattern="yyyy-MM-dd"/></td>
					<td><fmt:formatDate value="${free.modify_date}" pattern="yyyy-MM-dd"/></td>
					<td>${free.read_count}</td>
					<td>${free.good_count}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>