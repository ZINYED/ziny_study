<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/header_main.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	thead {
		text-align: center;
	}
	
	#row_num, #category, #user_nick, #create_date, #modify_date, #read_count, #good_count {
		text-align: center;
	}
	
	.page-item.active .page-link {
		background-color: white;	/* 원하는 배경색으로 변경 */
		color: black;				/* 텍스트 색상 변경 */
		border-color: gray;			/* 경계선 색상 변경 */
	}
	
</style>
</head>
<body>
	<!-- 내비게이션 바 -->
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
	
	<%-- <h6 id="total">총 건수 : ${freeTotal} </h6> --%>
	<button onclick="location.href='/board_free_write_form'">작성</button>
	<table class="table" id="freeList">
 		<thead>
			<tr>
				<th>번호</th><th>카테고리</th><th>제목</th><th>작성자</th><th>조회</th><th>추천</th><th>작성일</th>
				<!-- <th>수정일</th> -->
			</tr>
		</thead>
		<tbody class="table-group-divider">
			<c:forEach var="free" items="${freeList }" varStatus="status">
				<tr>
					<td id="row_num">${status.count}</td>
					<td id="category">${free.category}</td>
					<td id="subject"><a href="/board_free_read?doc_no=${free.doc_no}">${free.subject}</a></td>
					<td id="user_nick">${free.user_nick}</td>
					<td id="read_count">${free.read_count}</td>
					<td id="good_count">${free.good_count}</td>
					<td id="create_date"><fmt:formatDate value="${free.create_date}" pattern="yyyy-MM-dd"/></td>
					<%-- <td id="modify_date"><fmt:formatDate value="${free.modify_date}" pattern="yyyy-MM-dd"/></td> --%>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<nav aria-label="Page navigation example">
		<ul class="pagination justify-content-center">
			<c:if test="${page.startPage > page.pageBlock }">
				<li class="page-item"><a class="page-link" href="board_free_list?currentPage=${page.startPage - page.pageBlock }" tabindex="-1" aria-disabled="true">이전</a></li>
			</c:if>
		
			<c:forEach var="i" begin="${page.startPage }" end="${page.endPage }">
				<c:choose>
					<c:when test="${page.currentPage==i}"><li class="page-item active"></c:when>
					<c:otherwise><li class="page-item"></c:otherwise>
				</c:choose>
				<a class="page-link" href="board_free_list?currentPage=${i}">${i}</a></li>
			</c:forEach>
		
			<c:if test="${page.endPage < page.totalPage }">
				<li class="page-item"><a class="page-link" href="board_free_list?currentPage=${page.startPage + page.pageBlock }')">다음</a></li>
			</c:if>
		</ul>
	</nav>	
</body>
</html>