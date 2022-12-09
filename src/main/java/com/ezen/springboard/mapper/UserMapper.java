package com.ezen.springboard.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import com.ezen.springboard.entity.User;

@Mapper
public interface UserMapper {
	// SELECT * FROM T_USER
	//	WHERE USER_ID = :userId
	//		AND USER_PW = :userPw
	User findByUserIdAndUserPw(
			@Param("userId") String userId,
			@Param("userPw") String userPw);
	
	
	
}
