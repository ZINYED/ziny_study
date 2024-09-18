package com.oracle.playit.service;

import org.springframework.stereotype.Service;

import com.oracle.playit.dao.CommonDao;
import com.oracle.playit.dto.UserInfo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommonServiceImpl implements CommonService {

	private	final	CommonDao	cd;

	@Override
	public int join(UserInfo userInfo) {
		System.out.println("join Service Start");
		
		int result = 0;
		result = cd.join(userInfo);
		
		return result;
	}
	
}
