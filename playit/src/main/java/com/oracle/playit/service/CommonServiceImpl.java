package com.oracle.playit.service;

import org.springframework.stereotype.Service;

import com.oracle.playit.dao.CommonDao;
import com.oracle.playit.dto.UserInfo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommonServiceImpl implements CommonService {

	private	final	CommonDao	cd;

	// 회원가입
	@Override
	public int join(UserInfo userInfo) {
		System.out.println("join Service Start");
		
		int result = 0;
		result = cd.join(userInfo);
		
		return result;
	}

	// 로그인
	@Override
	public UserInfo login(UserInfo userInfo) {
		System.out.println("login Service Start");
		
		UserInfo userCheck = new UserInfo();
		userCheck = cd.login(userInfo);
		
		return userCheck;
	}
	
}
