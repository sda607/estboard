package com.est.mapper;

import java.util.List;

import com.est.domain.BoardVO;

public interface BoardMapper {

	//목록 조회  
	List<BoardVO> getList();
	
	void insert(BoardVO vo);
	
	void insertSelectKey(BoardVO board);
	
}
