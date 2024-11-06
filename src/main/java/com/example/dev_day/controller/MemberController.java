package com.example.dev_day.controller;

import lombok.RequiredArgsConstructor;
import com.example.dev_day.dto.MemberFormDTO;
import com.example.dev_day.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/member/sign-up")
    public String signUp()
    {
        return "/member/signup";
    }
    @PostMapping("/member/sign-up/answer")
    public String createMember(MemberFormDTO memberFormDTO)
    {
        Long memberId = memberService.join(memberFormDTO);
        return "redirect:/member/login";
    }
}
