package com.oracle.playit.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@org.springframework.stereotype.Controller
@RequiredArgsConstructor
public class Controller {
	
	@RequestMapping(value = "main")
	public String main() {
		
		return "main";
	}
}
