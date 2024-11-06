package com.example.dev_day.service;

import lombok.RequiredArgsConstructor;
import com.example.dev_day.entity.Member;
import com.example.dev_day.dto.MemberFormDTO;
import com.example.dev_day.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService
{
    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Long join(MemberFormDTO memberFormDTO){
        Member member = Member.builder()
                .member_id(memberFormDTO.getMember_id())
                .member_pw(memberFormDTO.getMember_pw())
                .member_name(memberFormDTO.getMember_name())
                .member_date(memberFormDTO.getMember_date())
                .member_income(memberFormDTO.getMember_income())
                .member_home(memberFormDTO.getMember_home())
                .member_category(
                        String.join(",", memberFormDTO.getMember_category()))
                .build();

        return memberRepository.save(member).getId();
    }
    @Override
    public void update(MemberFormDTO memberFormDTO) {
        return;
    }
}
