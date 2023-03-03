package org.comstudy.myweb;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet() - DispatcherServlet 요청");
		
		// path 만들기
		String ctxPath = req.getContextPath();
		String reqUri = req.getRequestURI();
		int beginIndex = ctxPath.length();
		String path = reqUri.substring(beginIndex);
		System.out.println("path >>>> " + path);
		// 하위 컨트롤러에서 path를 사용하도록 req에 저장
		req.setAttribute("path", path);
		
		//String viewName = new BoardController().process(req, resp);
		//String viewName = new SaramController().process(req, resp);
		Controller controller = new BoardController(); // 업캐스팅
		if(path.indexOf("/saram") != -1) {
			controller = new SaramController();
		} else if(path.indexOf("/board") != -1) {
			controller = new BoardController();
		}
		String viewName = controller.process(req, resp);
		
		RequestDispatcher view = req.getRequestDispatcher(viewName);
		view.forward(req, resp);
	}
}
