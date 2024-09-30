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
	<div>
		<table width="100%" style="margin-top:7px">
			<tr>
				<td style="text-align:right">
					<input type="button" class="btn btn-dark btn-sm" value="목록" onclick="location.href='board_free_list'">
					
					<!-- 작성자인 경우 보이도록 result = 1 -->
					<c:if test="${result == 1}">
						<input type="button" class="btn btn-dark btn-sm" value="수정" onclick="">
					</c:if>
					
					<!-- 작성자인 경우 보이도록 result = 1 -->
					<c:if test="${result == 1}">
						<input type="button" class="btn btn-dark btn-sm" value="삭제" onclick="">
					</c:if>
					<button type="button" class="btn btn-dark btn-sm" onclick="">추천</button>
				</td>
			</tr>
		</table>
		<table class="table">
			<colgroup>
				<col width="15%"></col>
				<col width="85%"></col>
			</colgroup>
			<tr><th>글 번호</th><td>${freeContent.doc_no}</td></tr>
			<tr><th>이름</th><td>${freeContent.user_nick}</td></tr>
			<tr><th>작성일</th><td>${freeContent.create_date}</td></tr>
			<tr><th>수정일</th><td>${freeContent.modify_date}</td></tr>
			<tr><th>게시종류</th><td>${freeContent.category}</td></tr>
			<tr><th>제목</th><td>${freeContent.subject}</td>
			<tr><th>본문</th><td>${freeContent.doc_body}</td>
			<tr><th>조회수</th><td>${freeContent.read_count}</td>
			<tr><th>추천</th><td>${freeContent.good_count}</td>
			<tr><th>첨부파일</th><td>${freeContent.attach_name}</td>
			
			<%-- 
			<tr><th>추천</th><td id="count_btn">${freeContent.good_count}</td></tr>
			<tr><th>첨부파일</th><td><a href="javascript:popup('/upload/${freeContent.attach_path}',800,600)">${freeContent.attach_name}</a></td></tr>
			 --%>	
		</table>
	</div>
</body>
</html>