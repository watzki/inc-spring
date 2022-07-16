package com.example.demo.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> GetMembers() {
        return memberRepository.findAll();
//        return List.of(
//                new Member(1L, "Datu", "Edwardo", "BUKLOD", 5, 6, true, false, false, false, false, false, false, false, true, false  )
//        );
    }

    public void addNewMember(Member member) {
        memberRepository.save(member);
    }

    public void deleteMember(Long memberId) {
        boolean exist = memberRepository.existsById(memberId);
        if (!exist) {
            throw new IllegalStateException("student wit id " + memberId + " does not exist");
        }
        memberRepository.deleteById(memberId);
    }
}
