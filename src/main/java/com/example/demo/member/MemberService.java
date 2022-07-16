package com.example.demo.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
    }

    public void addNewMember(Member member) {
        if (member.getIsDKN() == null) member.setIsDKN(false);
        if (member.getIsKNG() == null) member.setIsKNG(false);
        if (member.getIsMWT() == null) member.setIsMWT(false);
        if (member.getIsPAN() == null) member.setIsPAN(false);
        if (member.getIsPNK() == null) member.setIsPNK(false);
        if (member.getIsKAP() == null) member.setIsKAP(false);
        if (member.getIsSCN() == null) member.setIsSCN(false);
        if (member.getIsKAL() == null) member.setIsKAL(false);
        if (member.getIsILW() == null) member.setIsILW(false);
        if (member.getIsTSV() == null) member.setIsTSV(false);
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
        Member member = memberRepository.findById(memberId).orElseThrow(
                () -> new IllegalStateException("Student with id " + memberId + " does not exist"));

        if (memberDetails.getlName() != null) member.setlName(memberDetails.getlName());
        if (memberDetails.getfName() != null) member.setfName(memberDetails.getfName());
        if (memberDetails.getPurok() != null) member.setPurok(memberDetails.getPurok());
        if (memberDetails.getGrupo() != null) member.setGrupo(memberDetails.getGrupo());
        if (memberDetails.getKapisanan() != null) member.setKapisanan(memberDetails.getKapisanan());
        if (memberDetails.getIsDKN() != null) member.setIsDKN(memberDetails.getIsDKN());
        if (memberDetails.getIsKNG() != null) member.setIsKNG(memberDetails.getIsKNG());
        if (memberDetails.getIsMWT() != null) member.setIsMWT(memberDetails.getIsMWT());
        if (memberDetails.getIsPAN() != null) member.setIsPAN(memberDetails.getIsPAN());
        if (memberDetails.getIsPNK() != null) member.setIsPNK(memberDetails.getIsPNK());
        if (memberDetails.getIsKAP() != null) member.setIsKAP(memberDetails.getIsKAP());
        if (memberDetails.getIsSCN() != null) member.setIsSCN(memberDetails.getIsSCN());
        if (memberDetails.getIsKAL() != null) member.setIsKAL(memberDetails.getIsKAL());
        if (memberDetails.getIsILW() != null) member.setIsILW(memberDetails.getIsILW());
        if (memberDetails.getIsTSV() != null) member.setIsTSV(memberDetails.getIsTSV());

        return member;
    }
}
