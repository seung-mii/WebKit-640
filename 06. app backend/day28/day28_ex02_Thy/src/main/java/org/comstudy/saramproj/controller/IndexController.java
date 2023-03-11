package org.comstudy.saramproj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String index() {
		// 타입리프를 사용하면 src/main/resources의 templates가 뷰 기본 폴더이다.
		return "index";
	}
}
