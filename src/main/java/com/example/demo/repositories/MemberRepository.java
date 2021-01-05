package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

}
