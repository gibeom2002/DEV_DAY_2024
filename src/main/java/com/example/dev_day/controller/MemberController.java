package com.example.dev_day.controller;

import lombok.RequiredArgsConstructor;
import com.example.dev_day.dto.MemberFormDTO;
import com.example.dev_day.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public String createMember(@ModelAttribute MemberFormDTO memberFormDTO)
    {
        System.out.println(memberFormDTO.getMember_id());
        System.out.println(memberFormDTO.getMember_pw());
        System.out.println(memberFormDTO.getMember_name());

        System.out.println(memberFormDTO.getMember_date());
        System.out.println(memberFormDTO.getMember_income());
        System.out.println(memberFormDTO.getMember_home());
        System.out.println(memberFormDTO.getMember_category());

        Long memberId = memberService.join(memberFormDTO);
        return "redirect:/member/login";
    }
}
