<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function join_form() {
		// alert("회원가입");
		location.href="/join_form";
	}
	
	function login() {
		location.href="/login";
	}


</script>
</head>
<body>
	<div>
		<table>
			<tr>
				<th>아이디</th><td><input type="text"></td>
			</tr>
			<tr>
				<th>비밀번호</th><td><input type="password"></td>
			</tr>
			<tr>
				<td><input type="button" value="로그인" onclick="login()"></td>
				<td><input type="button" value="아이디/비밀번호 찾기"></td>
			</tr>
			<tr>
				<td><input type="button" value="회원가입" onclick="join_form()"></td>
			</tr>
		</table>
	</div>
</body>
</html>