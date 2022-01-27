package com.subin.project.community;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/community")
public class CmController {
	
	// cm_main.jsp
	@RequestMapping(value = "/cm_main")
	public String goCmMain() throws Exception{
		
		return "community/cm_main";
	}
}
