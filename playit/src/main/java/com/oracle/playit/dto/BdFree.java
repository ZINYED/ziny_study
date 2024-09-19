package com.oracle.playit.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BdFree {
	int			doc_no;			// 글 번호
	String		user_id;		// 회원 id
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date		create_date;	// 작성일시
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date		modify_date;	// 수정일시
	String		category;		// 카테고리
	String		subject;		// 제목
	String		doc_body;		// 본문
	int			read_count;		// 조회수
	int			good_count;		// 추천수
	String		attach_name;	// 첨부파일명
	String		attach_path;	// 첨부파일경로
	
	// 조회용
	String		user_nick;
}
