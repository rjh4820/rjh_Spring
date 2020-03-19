package com.brms.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.brms.member.Member;
import com.brms.member.dao.MemberDao;

public class MemberSearchService {

	@Autowired
	private MemberDao memberDao;
	
	public MemberSearchService() { }
	
	public Member searchMember(String mId) {
		return memberDao.select(mId);
	}
	
	public void destroyMethod() throws Exception {
		System.out.println("MemberSearchService 빈(Bean)객체 소멸 단계");
	}

	public void initMethod() throws Exception {
		System.out.println("MemberSearchService 빈(Bean)객체 생성 단계");
	}
	
}