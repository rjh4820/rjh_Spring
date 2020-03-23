package com.bs.testPjt008.member.service;

import org.springframework.stereotype.Service;

import com.bs.testPjt008.member.Member;

public interface IMemberService {
	void memberRegister(String memId, String memPw, String memMail, String memPhone1, String memPhone2, String memPhone3);
	Member memberSearch(String memId, String memPw);
	void memberModify();
	void memberRemove();
}
