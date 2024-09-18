package com.oracle.playit.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserInfo {
	String		user_id;		// 회원 id
	String		user_pw;		// 비밀번호
	String		user_name;		// 이름
	String		user_gender;	// 성별
	String		user_phone;		// 전화번호
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date		user_birth;		// 생년월일
	String		user_email;		// 이메일
	String		user_auth;		// 권한
	String		attach_name;	// 첨부파일명
	String		attach_path;	// 첨부파일경로
	String		del_status;		// 삭제 여부
	String		user_nick;		// 닉네임

}
