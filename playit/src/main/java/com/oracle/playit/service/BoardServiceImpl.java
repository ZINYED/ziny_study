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
	
	@Override
	public List<BdFree> freeList() {
		
		List<BdFree> freeList = new ArrayList<BdFree>();
		freeList = bd.freeList();
		
		return freeList;
	}

}
