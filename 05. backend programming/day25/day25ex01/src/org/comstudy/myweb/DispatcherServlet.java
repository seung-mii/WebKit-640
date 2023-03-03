package org.comstudy.myweb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy.myweb.board.model.BoardDTO;
import org.comstudy.myweb.saram.model.SaramDTO;

public class DispatcherServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet() - DispatcherServlet 요청");
		
		//testSaramService(req);
		ArrayList<BoardDTO> boardList = new ArrayList<BoardDTO>();
		boardList.add(new BoardDTO(1L, "연습글", "게시글 등록 연습입니다.", new Date(), "홍길동", 0L));
		boardList.add(new BoardDTO(2L, "연습글2", "게시글 등록 연습입니다2", new Date(), "김길동", 0L));
		
		req.setAttribute("boardList", boardList);
		
		String viewName = "/WEB-INF/views/board/list.jsp";
		RequestDispatcher view = req.getRequestDispatcher(viewName);
		view.forward(req, resp);
	}
	
	protected void testSaramService(HttpServletRequest req) {
		System.out.println("testSaramService() 실행");
		// SaramDTO 객체(Bean)가 저장된 List를 view 페이지에 전달 하기.
		SaramDTO saram = new SaramDTO(1, "hong", "홍길동", 25);
		req.setAttribute("saram", saram);
		
		ArrayList<SaramDTO> list = new ArrayList<SaramDTO>();
		list.add(new SaramDTO(2, "hong2", "홍길동2", 26));
		list.add(new SaramDTO(3, "hong3", "홍길동3", 23));
		list.add(new SaramDTO(4, "hong4", "홍길동4", 22));
		req.setAttribute("list", list);
	}
}
