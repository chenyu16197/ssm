package com.company.action.base;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/test")
@Controller
public class TestAction {
	@RequestMapping("/test")
	public String test(ModelMap model){
		model.addAttribute("test", "abc");
		return "test";
	}

}
