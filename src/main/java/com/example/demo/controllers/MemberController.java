package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Member;
import com.example.demo.services.MemberService;

@RestController
@RequestMapping("/members")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@PostMapping
	public ResponseEntity<Member> createMember(@RequestBody Member member) {
		memberService.createMember(member);
		return new ResponseEntity<Member>(HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Member>> getMembers(){
		List<Member> members = memberService.getMembers();
		return ResponseEntity.ok().body(members);
	}
}
