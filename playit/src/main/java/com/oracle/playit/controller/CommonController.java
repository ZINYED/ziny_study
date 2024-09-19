package com.oracle.playit.controller;

import javax.servlet.http.HttpSession;

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
	
	@RequestMapping(value = "/main")
	public String main() {
		
		return "main";
	}
	
	// 회원가입 페이지로 이동
	@RequestMapping(value = "/join_form")
	public String joinForm(Model model) {
		
		return "join_form";
	}
	
	// 회원가입
	@RequestMapping(value = "/join")
	public String join(Model model, UserInfo userInfo) {
		System.out.println("join Controller Start");
		
		int result = 0;
		result = cs.join(userInfo);
		
		return "login";
	}
	
	// 로그인
	@RequestMapping(value = "/login")
	public String login(Model model, UserInfo userInfo, HttpSession session) {
		
		return "login";
	}
	
	// 로그인 체크
	@RequestMapping(value = "/login_check")
	public String loginCheck(Model model, UserInfo userInfo, HttpSession session) {
		System.out.println("login Controller Start");
		
		// USER_INFO 테이블에 로그인 시도한 정보와 일치한 데이터가 있는지 확인
		UserInfo userCheck = userCheck = cs.login(userInfo);
		
		if (userCheck == null) {
			System.out.println("아이디 or 비밀번호 일치하지 않음");
			model.addAttribute("errorMsg", "아이디 또는 비밀번호를 확인해주세요.");
			
			return "forward:/login";
		} else {
			System.out.println("로그인 성공");
			session.setAttribute("userInfo", userCheck);	// 세션 생성, 저장
			System.out.println("세션 생성 user_id : " + userCheck.getUser_id());
			
			return "redirect:/main";
		}
	}
	
	// 로그아웃
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		System.out.println("세션 삭제");

		return "redirect:/login";
	}
	
	
}
