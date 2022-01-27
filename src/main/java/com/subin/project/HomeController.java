package com.subin.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	// main-layout
	@RequestMapping(value = "/layout/main")
	public String getMainLayout() throws Exception{
		
		return "layout/main";
	}
	
	// index
	@RequestMapping(value = "/")
	public String goIndex() throws Exception{
		
		return "index";
	}
	
}
