package com.oracle.playit.service;

import java.util.List;

import com.oracle.playit.dto.BdFree;

public interface BoardService {

	List<BdFree> freeList();

	int freeWrite(BdFree bdfree);

}
