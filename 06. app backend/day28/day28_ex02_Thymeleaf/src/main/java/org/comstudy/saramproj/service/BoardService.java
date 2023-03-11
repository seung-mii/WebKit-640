package org.comstudy.saramproj.service;


import java.util.List;

import org.comstudy.saramproj.domain.Board;
import org.comstudy.saramproj.persistence.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BoardService {
	@Autowired
	private BoardRepository boardRepository;
	
	public void insertBoard(Board board) {
		System.out.println(">>>> insertBoard - BoardRepository");
		boardRepository.save(board);
	}
	
	public void updateBoard(Board board) {
		Board findBoard = boardRepository.findById(board.getSeq()).get();
		findBoard.setTitle(board.getTitle());
		findBoard.setContent(board.getContent());
		boardRepository.save(findBoard);
	}
	
	public void deleteBoard(Board board) {
		boardRepository.deleteById(board.getSeq());
	}
	
	public Board getBoard(Board board) {
		return boardRepository.findById(board.getSeq()).get();
	}
	
	@Transactional(readOnly = true)
	public List<Board> getBoardList() {
		return boardRepository.getBoardList("");
	}
}