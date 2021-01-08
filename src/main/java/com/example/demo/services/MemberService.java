package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Member;
import com.example.demo.repositories.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository memberRepo;
	
	public void createMember(Member member) { 
		memberRepo.save(member);
	}
	
	public List<Member> getMembers() {
		List<Member> members = memberRepo.findAll();
		return members;
	}
	
	public Member getMember(Integer id) {
		Optional<Member> member = memberRepo.findById(id);
		return member.orElseThrow(() -> new RuntimeException("Member not found!"));
	}

	public void deleteMember(Integer id) {
		Member member = getMember(id);
		memberRepo.save(member);
	}
}

