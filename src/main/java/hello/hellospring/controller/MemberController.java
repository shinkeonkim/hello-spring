package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    private final MemberService memberService;

//    dependency injection - 필드 주입
//    @Autowired private final MemberService memberService;

//    dependency injection - setter 주입
//    @Autowired
//    public  void setMemberService(MemberService memberService) {
//        this.memberService = memberService;
//    }
//    의존 관계가 실행 중에 동적으로 변하는 경우는 대부분 없으므로, 생성자 주입을 권장한다.
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/";
    }

}
