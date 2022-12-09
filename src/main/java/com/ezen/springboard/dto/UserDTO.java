package com.ezen.springboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
	private String userId;
	private String userPw;
	private String userNm;
	private String userMail;
	private String userTel;
	private String userRegdate;
	private String userRole;
}
