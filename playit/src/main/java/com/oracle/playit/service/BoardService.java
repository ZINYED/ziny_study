package com.oracle.playit.service;

import java.util.List;

import com.oracle.playit.dto.BdFree;

public interface BoardService {

	int freeTotal();
	
	List<BdFree> freeList(BdFree bdfree);

	int freeWrite(BdFree bdfree);

	BdFree freeRead(int doc_no);

	int freeDelete(int doc_no);

	

}
