package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@DeleteMapping("{id}")
	public ResponseEntity<Member> deleteMember(@PathVariable Integer id){
		memberService.deleteMember(id);
		return new ResponseEntity<Member>(HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Member> getMember(@PathVariable Integer id){
		return new ResponseEntity<Member>(memberService.getMember(id),HttpStatus.OK);
	}
}
