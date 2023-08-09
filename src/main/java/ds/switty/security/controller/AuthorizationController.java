package ds.switty.security.controller;

import ds.switty.security.dto.MemberDetail;
import ds.switty.security.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthorizationController {

    private final MemberService memberService;

    @PostMapping("/join")
    public ResponseEntity<String> join(MemberDetail detail) {
        try {
            memberService.createMember(detail);
            return ResponseEntity.ok("join success");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
