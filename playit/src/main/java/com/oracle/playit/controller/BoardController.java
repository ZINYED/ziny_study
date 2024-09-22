package com.oracle.playit.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.playit.dto.BdFree;
import com.oracle.playit.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class BoardController {

	private final	BoardService	bs;
	
	// 자유 게시판 목록
	@RequestMapping(value = "/board_free_list")
	public String boardFreeList(HttpSession session, Model model, BdFree bdfree) {
		System.out.println("boardFreeList Controller");
		
		List<BdFree> freeList = new ArrayList<BdFree>();
		freeList = bs.freeList();

		model.addAttribute("freeList", freeList);
		
		return "/board/board_free/free_list";
	}
	
	// 자유 게시판 게시글 작성 페이지로 이동
	@RequestMapping(value = "/board_free_write_form")
	public String boardFreeWriteForm(HttpSession session, Model model, BdFree bdfree) {
		System.out.println("boardFreeWriteForm Controller");
		
		return "/board/board_free/free_write";
	}
	
	// 자유 게시판 게시글 작성
	@RequestMapping(value = "/board_free_write")
	public String boardFreeWrite(HttpSession session, Model model, BdFree bdfree) {
		System.out.println("boardFreeWrite");
		
		// 세션에서 user id 가져와서 bdfree 작성자에 저장 필요!
		
		return "/board/board_free/free_list";
	}
	
}
