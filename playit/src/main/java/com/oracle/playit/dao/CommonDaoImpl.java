package com.oracle.playit.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.oracle.playit.dto.UserInfo;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class CommonDaoImpl implements CommonDao {
	
	private	final	SqlSession	sqls;
	
	// 회원가입
	@Override
	public int join(UserInfo userInfo) {
		System.out.println("join Dao Start");
		
		int result = 0;
		
		try {
			result = sqls.insert("userInsert", userInfo);
			System.out.println("join Dao insertResult -> " + result);
		} catch (Exception e) {
			System.out.println("join Dao Exception -> " + e.getMessage());
		}

		return result;
	}

	// 로그인
	@Override
	public UserInfo login(UserInfo userInfo) {
		System.out.println("login Dao Start");
		
		UserInfo userCheck = new UserInfo();
		
		try {
			userCheck = sqls.selectOne("userCheck", userInfo);
			System.out.println("login Dao selectResult -> " + userCheck);
		} catch (Exception e) {
			System.out.println("login Dao Exception -> " + e.getMessage());
		}
		
		return userCheck;
	}
	
	
}
