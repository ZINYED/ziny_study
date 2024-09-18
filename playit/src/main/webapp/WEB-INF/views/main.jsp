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
	


</script>
</head>
<body>
	<div>
		<form action="login" method="post">
			<table>
				<tr>
					<th>ID</th><td><input type="text" name="user_id"></td>
				</tr>
				<tr>
					<th>Password</th><td><input type="password" name="user_pw"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login"></td>
				</tr>
				<tr>
					<td><input type="button" value="아이디 찾기"></td>
					<td><input type="button" value="비밀번호 찾기"></td>
					<td><input type="button" value="회원가입" onclick="join_form()"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>