package com.oracle.playit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.oracle.playit.dao.BoardDao;
import com.oracle.playit.dto.BdFree;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	private final	BoardDao	bd;
	
	// 자유 게시판 전체 게시글 수
	@Override
	public int freeTotal() {
		
		int result = bd.freeTotal();
		
		return result;
	}
	
	// 자유 게시판 목록
	@Override
	public List<BdFree> freeList(BdFree bdfree) {
		
		List<BdFree> freeList = new ArrayList<BdFree>();
		freeList = bd.freeList(bdfree);
		
		return freeList;
	}
	
	// 자유 게시판 게시글 작성
	@Override
	public int freeWrite(BdFree bdfree) {
		// System.out.println("boardFreeWrite Service");
		
		int result = bd.freeWrite(bdfree);
		
		return result;
	}

	// 자유 게시판 상세 페이지
	@Override
	public BdFree freeRead(int doc_no) {
		// System.out.println("boardFreeRead Service");
		
		BdFree bdfree = new BdFree();
		bdfree = bd.freeRead(doc_no);
		
		return bdfree;
	}

	// 자유 게시판 게시글 삭제
	@Override
	public int freeDelete(int doc_no) {
		System.out.println("boardFreeDelete Service");
		
		int result = bd.freeDelete(doc_no);
		
		return result;
	}

	

}
