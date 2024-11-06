package com.example.dev_day.member_service;

import com.example.dev_day.member_dto.MemberFormDTO;

public interface MemberService
{
    Long join(MemberFormDTO memberFormDTO);
}
