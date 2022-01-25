package com.subin.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	// 수빈 홈페이지 첫 화면
	@RequestMapping(value = "/")
	public String goIndex() {
		
		return "index";
	}

}
