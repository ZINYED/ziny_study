package com.oracle;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BdFree {
	private	int			doc_no;			// 글 번호
	private String		user_id;		// 회원 ID
	private	Date		create_date;	// 작성일시
	private	Date		modify_date;	// 수정일시
	private	String		category;		// 카테고리
	private String		subject;		// 제목
	private	String		doc_body;		// 본문
	private	int			read_count;		// 조회수
	private int			good_count;		// 추천수
	private	String		attach_name;	// 첨부파일명
	private String		attach_path;	// 첨부파일경로
}
