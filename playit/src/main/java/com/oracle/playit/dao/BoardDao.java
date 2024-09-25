package com.oracle.playit.dao;

import java.util.List;

import com.oracle.playit.dto.BdFree;

public interface BoardDao {

	List<BdFree> freeList();

	int freeWrite(BdFree bdfree);

}
