package com.example.dev_day.join;

import lombok.RequiredArgsConstructor;
import com.example.dev_day.member_dto.MemberFormDTO;
import com.example.dev_day.member_service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// 나중에 의존관계 관련하여 필요한 어노테이션
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    @GetMapping("/")
    public String home()
    {
        return "home";
    }

    @GetMapping("/members/new")
    public String createMemberForm()
    {
        return "members/createMemberForm";
    }
    @GetMapping("/members/new")
    public String createMember(MemberFormDTO memberFormDTO)
    {
        Long memberId = memberService.join(memberFormDTO);
        return "home";
    }
}
