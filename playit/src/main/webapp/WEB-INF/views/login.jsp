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
		<form action="login_check" method="post">
			<table>
				<tr>
					<th>ID</th><td><input type="text" name="user_id" required="required"></td>
				</tr>
				<tr>
					<th>Password</th><td><input type="password" name="user_pw" required="required"></td>
				</tr>
				
				<c:if test="${errorMsg != null}">
					<div class="invalid-feedback" style="display:block">${errorMsg}</div>
				</c:if>
				
				<tr>
					<td><input type="submit" value="Login"></td>
				</tr>
				<tr>
					<td><input type="button" value="아이디 찾기"></td>
					<td><input type="button" value="비밀번호 찾기"></td>
					<td><input type="button" value="회원가입" onclick="location.href='/join_form'"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>