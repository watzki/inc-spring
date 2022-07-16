package com.example.demo.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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
            throw new IllegalStateException("Student with id " + memberId + " does not exist");
        }
        memberRepository.deleteById(memberId);
    }

    @Transactional
    public Member updateMember(Long memberId, Member memberDetails) {
        Optional<Member> member = memberRepository.findById(memberId);
        if (!member.isPresent()) {
            throw new IllegalStateException("Student with id " + memberId + " does not exist");
        }

        if (memberDetails.getlName() != null) member.get().setlName(memberDetails.getlName());
        if (memberDetails.getfName() != null) member.get().setfName(memberDetails.getfName());
        if (memberDetails.getPurok() != null) member.get().setPurok(memberDetails.getPurok());
        if (memberDetails.getGrupo() != null) member.get().setGrupo(memberDetails.getGrupo());
        if (memberDetails.getKapisan() != null) member.get().setKapisan(memberDetails.getKapisan());
        if (memberDetails.getIsDKN() != null) member.get().setIsDKN(memberDetails.getIsDKN());
        if (memberDetails.getIsKNG() != null) member.get().setIsKNG(memberDetails.getIsKNG());
        if (memberDetails.getIsMWT() != null) member.get().setIsMWT(memberDetails.getIsMWT());
        if (memberDetails.getIsPAN() != null) member.get().setIsPAN(memberDetails.getIsPAN());
        if (memberDetails.getIsPNK() != null) member.get().setIsPNK(memberDetails.getIsPNK());
        if (memberDetails.getIsKAP() != null) member.get().setIsKAP(memberDetails.getIsKAP());
        if (memberDetails.getIsSCN() != null) member.get().setIsSCN(memberDetails.getIsSCN());
        if (memberDetails.getIsKAL() != null) member.get().setIsKAL(memberDetails.getIsKAL());
        if (memberDetails.getIsILW() != null) member.get().setIsILW(memberDetails.getIsILW());
        if (memberDetails.getIsTSV() != null) member.get().setIsTSV(memberDetails.getIsTSV());

        Member updatedMember = memberRepository.save(member.get());

        return updatedMember;
    }
}
