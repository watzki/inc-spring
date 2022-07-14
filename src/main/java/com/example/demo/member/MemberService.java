package com.example.demo.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Autowired
    public List<Member> GetMembers() {
        return memberRepository.findAll();
//        return List.of(
//                new Member(1L, "Datu", "Edwardo", "BUKLOD", 5, 6, true, false, false, false, false, false, false, false, true, false  )
//        );
    }
}