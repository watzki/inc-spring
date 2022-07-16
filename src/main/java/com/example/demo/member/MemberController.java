package com.example.demo.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/member")
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    public List<Member> GetMembers() {
        return memberService.GetMembers();
    }

    @PostMapping
    public void AddMember(@RequestBody Member member) {
        System.out.println("Member Payload: " + member);
        memberService.addNewMember(member);
    }

    @DeleteMapping(path = "{memberId}")
    public void DeleteMember(@PathVariable("memberId") Long memberId) {
        memberService.deleteMember(memberId);
    }
}
