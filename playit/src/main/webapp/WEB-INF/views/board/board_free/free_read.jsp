<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/header_main.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#buttons {
		text-align: right;
	}
	
</style>
<script type="text/javascript">
	function popup(url, width, height) {
	    // 화면의 중앙에 팝업을 띄우기 위해 위치 계산
	    var left = (screen.width / 2) - (width / 2);
	    var top = (screen.height / 2) - (height / 2);

	    window.open(url, 'popupWindow', 'width=' + width + ',height=' + height + ',top=' + top + ',left=' + left);
	};
	
	function delchk() {
		var answer = confirm('삭제하시겠습니까?');
		
		if (answer) {
			var doc_no = ${freeContent.doc_no};
			
			var sendurl = "/board_free_delete/?doc_no=" + doc_no;
			console.log(sendurl);
			
			$.ajax({
				url		: sendurl,
				dataType: 'json',
				success	: function(data) {
					alert("삭제되었습니다.");
					location.href="/board_free_list";
				}
			});
		} else {
			return false;
		};
	};
	
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
	
	<!-- 본문 -->
	<div>
		<table class="table">
			<tr>
				<td id="buttons">
					<input type="button" class="btn btn-dark btn-sm" value="목록" onclick="location.href='board_free_list'">
					
					<!-- 작성자인 경우 보이도록 result = 1 -->
					<c:if test="${result == 1}">
						<input type="button" class="btn btn-dark btn-sm" value="수정" onclick="">
					</c:if>
					<c:if test="${result == 1}">
						<input type="button" class="btn btn-dark btn-sm" value="삭제" onclick="delchk()">
					</c:if>
					<input type="button" class="btn btn-dark btn-sm" value="추천" onclick="">
				</td>
			</tr>
		</table>
		
		<table class="table">
			<colgroup>
			    <col width="15%"></col>
			    <col width="35%"></col>
			    <col width="15%"></col>
			    <col width="35%"></col>
			</colgroup>
			<%-- <tr><th>글 번호</th><td colspan="3">${freeContent.doc_no}</td></tr> --%>
			<tr><th colspan="4">[${freeContent.category}] ${freeContent.category}</th></tr>
			<tr><th>작성자</th><td colspan="3">${freeContent.user_nick}</td></tr>
			<tr><th>작성일</th><td><fmt:formatDate value="${freeContent.create_date}" pattern="yyyy-MM-dd"/></td>
				<th>수정일</th><td><fmt:formatDate value="${freeContent.modify_date}" pattern="yyyy-MM-dd"/></td></tr>
			<tr><th>본문</th><td colspan="3">${freeContent.doc_body}</td>
			<tr><th>조회수</th><td>${freeContent.read_count}</td>
				<th>추천</th><td>${freeContent.good_count}</td></tr>
			<tr><th>첨부파일</th>
				<td colspan="3">
					<c:if test="${freeContent.attach_name != null}">
						<a href="javascript:popup('${pageContext.request.contextPath}/upload/${freeContent.attach_path}',800,600)">${freeContent.attach_name}</a>
					</c:if>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>