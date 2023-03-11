package org.comstudy.saramproj;

import java.util.List;

import org.comstudy.saramproj.domain.Board;
import org.comstudy.saramproj.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/getBoardList")
	public String index(Model model) {
		List<Board> boardList = boardService.getBoardList();
		System.out.println(boardList);
		model.addAttribute("boardList", boardList);
		return "getBoardList";
	}
	
	@GetMapping("/insertBoard")
	public String insertForm() {
		return "insertForm";
	}
	
	@PostMapping("/insertBoard")
	public String insertBoardProc(Board board) {
		System.out.println("insertBoardProc: " + board);
		boardService.insertBoard(board);
		return "redirect:getBoardList";
	}
}
