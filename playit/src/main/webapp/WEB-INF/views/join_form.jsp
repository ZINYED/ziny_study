<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="join" method="post">
		<table>
			<tr>
				<th>아이디</th><td><input type="text" name="user_id"></td>
			</tr>
			<tr>
				<th>비밀번호</th><td><input type="password" name="user_pw"></td>
			</tr>
			<tr>
				<th>이름</th><td><input type="text" name="user_name"></td>
			</tr>
			<tr>
				<th>닉네임</th><td><input type="text" name="user_nick"></td>
			</tr>
			<tr>
				<th>이메일</th><td><input type="email" name="user_email"></td>
			</tr>
			<tr>
				<th>전화번호</th><td><input type="tel" name="user_phone"></td>
			</tr>
			<tr>
				<th>생년월일</th><td><input type="date" name="user_birth"></td>
			</tr>
			<tr>
				<th>성별</th>
				<td>
					<input type="radio" name="user_gender" value="M"> 남
					<input type="radio" name="user_gender" value="F"> 여
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="회원가입"></td>
			</tr>
		</table>
	</form>
</body>
</html>