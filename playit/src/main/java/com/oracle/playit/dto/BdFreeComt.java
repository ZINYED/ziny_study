package com.oracle.playit.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BdFreeComt {
	int			doc_no;				// 글 번호
	int			comment_doc_no;		// 댓글 번호
	String		user_id;			// 회원 id
	Date		create_date;		// 작성일시
	Date		modify_date;		// 수정일시
	String		comment_context;	// 댓글 내용
	String		alarm_flag;			// 알림
}
