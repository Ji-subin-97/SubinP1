package com.subin.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "common")
public class CommonController {
	
	// Header
	@RequestMapping(value = "/header")
	public String getHeader() {
		
		return "common/header";
	}
	
	// Footer
	@RequestMapping(value = "/footer")
	public String getFooter() {
		
		return "common/footer";
	}
}
