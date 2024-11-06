package com.example.dev_day.member_service;

import lombok.RequiredArgsConstructor;
import com.example.dev_day.member_domain.Member;
import com.example.dev_day.member_dto.MemberFormDTO;
import com.example.dev_day.member_repository.Member_repository;
import org.springframework.stereotype.Service;

// 내가 서비스다.
@Service
// MemberRepository의 생성자를 사용안하기 위함
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService
{
    private final Member_repository memberRepository;

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
}
