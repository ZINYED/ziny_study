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
	
	// 회원가입 페이지로 이동
	@RequestMapping(value = "join_form")
	public String joinForm(Model model) {
		
		return "join_form";
	}
	
	// 회원가입
	@RequestMapping(value = "join")
	public String join(Model model, UserInfo userInfo) {
		System.out.println("join Controller Start");
		
		int result = 0;
		result = cs.join(userInfo);
		
		return "main";
	}
	
	// 로그인
	@RequestMapping(value = "login")
	public String login(Model model, UserInfo userInfo) {
		System.out.println("login Controller Start");
		
		// USER_INFO 테이블에 로그인 시도한 정보와 일치한 데이터가 있는지 확인
		UserInfo userCheck = new UserInfo();
		
		int result = 0;
		userCheck = cs.login(userInfo);
		
		return "main";
	}
}
