package com.oracle;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserInfo {
	private	String	user_id;		// 회원 ID
	private	String	user_pw;		// 회원 비밀번호
	private	String	user_name;		// 이름
	private	String	user_nick;		// 닉네임
	private	String	user_gender;	// 성별
	private	String	user_phone;		// 전화번호
	private	Date	user_birth;		// 생년월일
	private	String	user_email;		// 이메일
	private	String	user_auth;		// 권한
	private	String	attach_name;	// 첨부파일명
	private	String	attach_path;	// 첨부파일경로
	private	String	del_status;		// 삭제 여부

}
