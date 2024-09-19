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
	
	@Override
	public List<BdFree> freeList() {
		
		List<BdFree> freeList = new ArrayList<BdFree>();
		
		try {
			freeList = sqls.selectList("freeList");
			System.out.println("freeList size : " + freeList.size());
		} catch (Exception e) {
			System.out.println("freeList Dao Exception : " + e.getMessage());
		}
		
		return freeList;
	}

}
