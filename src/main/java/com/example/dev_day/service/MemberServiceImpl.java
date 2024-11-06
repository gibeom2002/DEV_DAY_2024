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
                .user_pw(memberFormDTO.getUser_pw())
                .user_id((memberFormDTO.getUser_id()))
                .user_name(memberFormDTO.getUser_name())
                .user_home(memberFormDTO.getUser_home())
                .user_date(memberFormDTO.getUser_date())
                .build();
        return memberRepository.save(member).getId();
    }
    @Override
    public void update(MemberFormDTO memberFormDTO) {
        return;
    }
}
