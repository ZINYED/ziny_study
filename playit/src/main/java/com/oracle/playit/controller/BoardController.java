package com.oracle.playit.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.oracle.playit.dto.BdFree;
import com.oracle.playit.dto.Paging;
import com.oracle.playit.dto.UserInfo;
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
	public String boardFreeList(Model model, BdFree bdfree, String currentPage) {
		System.out.println("boardFreeList Controller");
		
		int freeTotal = bs.freeTotal();
		model.addAttribute("freeTotal", freeTotal);
		
		// 페이징
		Paging page = new Paging(freeTotal, currentPage, 10);
		bdfree.setStart(page.getStart());
		bdfree.setEnd(page.getEnd());
		
		model.addAttribute("page", page);
		
		// 자유 게시판 리스트 가져오기 (페이징 작업 추가)
		List<BdFree> freeList = new ArrayList<BdFree>();
		freeList = bs.freeList(bdfree);
		
		model.addAttribute("freeList", freeList);
		
		return "/board/board_free/free_list";
	}
	
	// 자유 게시판 게시글 작성 페이지로 이동
	@RequestMapping(value = "/board_free_write_form")
	public String boardFreeWriteForm() {
		System.out.println("boardFreeWriteForm Controller");
		
		return "/board/board_free/free_write";
	}
	
	//-----------------------------------------------------------------------------------------------
	// 파일 업로드 메소드
	private String uploadFile(String originalFilename, byte[] bytes, String uploadPath) throws IOException {
		UUID uid = UUID.randomUUID();
		System.out.println("uploadPath : " + uploadPath);				// 파일이 저장되는 주소
		
		// Directory 생성
		File fileDirectory = new File(uploadPath);
		if (!fileDirectory.exists()) {
			// 신규 폴더(Directory) 생성
			fileDirectory.mkdirs();
			System.out.println("업로드용 폴더 생성 : " + uploadPath);
		}
		
		String savedName = uid.toString() + "_" + originalFilename;		// 저장되는 파일명
		log.info("savedName : " + savedName);
		File target = new File(uploadPath, savedName);
		
		FileCopyUtils.copy(bytes, target);
		
		return savedName;
	}
	//-----------------------------------------------------------------------------------------------
	
	// 자유 게시판 게시글 작성
	@RequestMapping(value = "/board_free_write")
	public String boardFreeWrite(Model model, BdFree bdfree, HttpServletRequest request, 
								@RequestParam(value = "file1", required = false)MultipartFile file1) throws IOException {
		System.out.println("boardFreeWrite Controller");
		
		// user 정보 세션에 저장
		System.out.println("session.userInfo->"+request.getSession().getAttribute("userInfo"));
		UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
		
		bdfree.setUser_id(userInfo.getUser_id());
		
		// 첨부파일 업로드
		if (!file1.isEmpty()) {
			String attach_path = "upload";
			String uploadPath = request.getSession().getServletContext().getRealPath("/upload/");		// 저장 위치 주소 지정
			
			System.out.println("File Upload Post Start");
			
			log.info("originalFilename : " + file1.getOriginalFilename());		// 원본 파일명
			log.info("size : " + file1.getSize());								// 파일 사이즈
			log.info("contextType : " + file1.getContentType());				// 파일 타입
			log.info("uploadPath : " +  uploadPath);							// 파일 저장되는 주소
			
			String savedName = uploadFile(file1.getOriginalFilename(), file1.getBytes(), uploadPath);	// 저장되는 파일명
			log.info("Return savedName : " + savedName);
			bdfree.setAttach_name(file1.getOriginalFilename());
			bdfree.setAttach_path(savedName);
		}
		
		System.out.println("bdfree -> " + bdfree);
		
		int result = bs.freeWrite(bdfree);
				
		return "redirect:/board_free_list";
	}
	
	// 자유 게시판 상세 페이지
	@RequestMapping(value = "/board_free_read")
	public String boardFreeRead(Model model, BdFree bdfree, HttpServletRequest request) {
		System.out.println("boardFreeRead Controller");
		
		System.out.println("글 번호 : " + bdfree.getDoc_no());
		
		return "/board/board_free/free_read";
	}
	
}
