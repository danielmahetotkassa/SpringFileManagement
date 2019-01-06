package com.file.management.FileUploadDownload.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
	
	
	List<String> params = new ArrayList<>();
	String str = "";
	
	
	@RequestMapping("/page2")
	@ModelAttribute
	public String page1(@RequestParam("msg") String msg, Model model) {
		
		
		model.addAttribute("msg", msg);
		str = msg;
		params.add(msg);
		
		return "page2";
	}
	
	@RequestMapping("/page")
	public String page(){
		
		return "page";
	}
	
	@RequestMapping("/page3")
	public String page2(Model model) {
		
		
		
		//model.addAllAttributes(str);
		model.addAttribute("msg", str);
		return "page3";
		
	}

}
