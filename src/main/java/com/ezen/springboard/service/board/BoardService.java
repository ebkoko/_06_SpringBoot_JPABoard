package com.ezen.springboard.service.board;

import java.util.List;

import com.ezen.springboard.entity.Board;
import com.ezen.springboard.entity.BoardFile;

public interface BoardService {
	Board getBoard(int boardNo);
	
	List<Board> getBoardList(Board board);
	
	void insertBoard(Board board);
	
	Board updateBoard(Board board);
	
	void deleteBoard(int boardNo);
	
	void insertBoardFile(BoardFile boardFile);
	
	void updateBoardCnt(int boardNo);
}
