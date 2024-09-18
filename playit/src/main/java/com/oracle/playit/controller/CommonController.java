package com.oracle.playit.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.playit.dto.UserInfo;
import com.oracle.playit.service.CommonService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@org.springframework.stereotype.Controller
@RequiredArgsConstructor
public class CommonController{
	
	private	final	CommonService	cs;
	
	@RequestMapping(value = "main")
	public String main() {
		
		return "main";
	}
	
	@RequestMapping(value = "join_form")
	public String joinForm(Model model) {
		
		return "join_form";
	}
	
	@RequestMapping(value = "join")
	public String join(Model model, UserInfo userInfo) {
		System.out.println("join Controller Start");
		
		int result = 0;
		
		result = cs.join(userInfo);
		
		return "main";
	}
	
	@RequestMapping(value = "login")
	public String login(UserInfo userInfo) {
		System.out.println("login Controller Start");
		
		
		
		return "main";
	}
}
