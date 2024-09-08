package com.oracle;

import java.util.Date;

import lombok.ToString;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@ToString
public class BdFreeComt {
	private	int			doc_no;				// 글 번호
	private	int			comment_doc_no;		// 댓글 번호
	private String		user_id;			// 회원 ID
	private	Date		create_date;		// 작성일시
	private	Date		modify_date;		// 수정일시
	private	String		comment_context;	// 댓글 내용
	private	String		alarm_flag;			// 알림 확인 여부

	
}
