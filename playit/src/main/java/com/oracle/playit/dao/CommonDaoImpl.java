package com.oracle.playit.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.oracle.playit.dto.UserInfo;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class CommonDaoImpl implements CommonDao {
	
	private	final	SqlSession	session;
	
	@Override
	public int join(UserInfo userInfo) {
		System.out.println("join Dao Start");
		
		int result = 0;
		
		try {
			result = session.insert("userInsert", userInfo);
			System.out.println("join Dao insertResult -> " + result);
		} catch (Exception e) {
			System.out.println("join Dao Exception -> " + e.getMessage());
		}

		return result;
	}
	
	
}
