package com.example.demo.member;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    public List<Member> GetMembers() {
        return List.of(
                new Member(1L, "Datu", "Edwardo", "BUKLOD", 5, 6, true, false, false, false, false, false, false, false, true, false  )
        );
    }
}
