<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/header_main.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PLAYIT Login</title>
<style type="text/css">
	#login_box {
		border: solid 1px silver;
		padding: 20px 40px;
		border-radius: 15px;
	}

</style>
</head>
<body class="d-flex align-items-center justify-content-center">
	<div class="mb-3" id="login_box">
		<h2>PLAYIT</h2><br>
		
		<form action="login_check" method="post">
			<div class="mb-3 form-floating">
				<input type="text" class="form-control" name="user_id" id="user_id" placeholder="ID" value="${user_id}" required="required">
				<label for="user_id">ID</label>
			</div>
			<div class="mb-3 form-floating">
				<input type="password" class="form-control" name="user_pw" id="user_pw" placeholder="Password" required="required">
				<label for="user_pw">Password</label>
			</div>
			
			<c:if test="${errorMsg != null}">
				<div class="invalid-feedback" style="display:block">${errorMsg}</div>
			</c:if>
			
			<!-- 구현 필요 -->
			<div class="mb-3 form-check text-start my-3">
				<input class="form-check-input" type="checkbox" value="remember_me" id="remember_check">
				<label class="form-check-label" for="remember_check">
					아이디 저장하기
				</label>
			</div>
			
			<button class="btn btn-primary w-100 py-2" type="submit">Login</button>
			
			<div style="margin-top:20px">
				<input type="button" class="btn btn-secondary btn-sm" value="아이디 찾기">
				<input type="button" class="btn btn-secondary btn-sm" value="비밀번호 찾기">
				<input type="button" class="btn btn-secondary btn-sm" value="회원가입" onclick="location.href='/join_form'">
			</div>
		</form>
	</div>
</body>
</html>