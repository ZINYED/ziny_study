package com.oracle.playit.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.oracle.playit.dto.BdFree;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BoardDaoImpl implements BoardDao {
	
	private final	SqlSession	sqls;
	
	// 자유 게시판 전체 게시글 수
	@Override
	public int freeTotal() {
		int result = 0;
		
		try {
			result = sqls.selectOne("freeTotal");
			System.out.println("freeTotal : " + result);
		} catch (Exception e) {
			System.out.println("freeTotal Dao Exception : " + e.getMessage());
		}
		
		return result;
	}
	
	// 자유 게시판 목록
	@Override
	public List<BdFree> freeList(BdFree bdfree) {
		List<BdFree> freeList = new ArrayList<BdFree>();
		
		try {
			freeList = sqls.selectList("freeList", bdfree);
			System.out.println("freeList size : " + freeList.size());
		} catch (Exception e) {
			System.out.println("freeList Dao Exception : " + e.getMessage());
		}
		
		return freeList;
	}

	// 자유 게시판 게시글 작성
	@Override
	public int freeWrite(BdFree bdfree) {
		int result = 0;
		
		try {
			result = sqls.insert("freeInsert", bdfree);
			System.out.println("freeInsert result : " + result);
		} catch (Exception e) {
			System.out.println("freeInsert Dao Exception : " + e.getMessage());
		}
		
		return result;
	}

	// 자유 게시판 상세 페이지
	@Override
	public BdFree freeRead(int doc_no) {
		// System.out.println("boardFreeWrite Dao");
		
		BdFree bdfree = new BdFree();
		
		try {
			bdfree = sqls.selectOne("freeSelect", doc_no);
			System.out.println("freeSelect : " + bdfree);
		} catch (Exception e) {
			System.out.println("freeSelect Dao Exception : " + e.getMessage());
		}
		
		return bdfree;
	}

	// 자유 게시판 상세 페이지
	@Override
	public int freeDelete(int doc_no) {
		System.out.println("boardFreeDelete Dao");
		
		int result = 0;
		
		try {
			result = sqls.delete("freeDelete", doc_no);
			System.out.println("freeDelete result : " + result);
		} catch (Exception e) {
			System.out.println("freeDelete Dao Exception : " + e.getMessage());
		}
		
		return result;
	}

	

}
