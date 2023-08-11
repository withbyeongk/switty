package ds.switty.user.controller;


import ds.switty.user.dto.UserDetail;
import ds.switty.user.dto.UserLogin;
import ds.switty.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/add")
    public String goAddForm(Model model) {
        model.addAttribute("memberDetail",new UserDetail());
        return "member/addForm";
    }

    @PostMapping("/add")
    public String addMember(UserDetail detail) {
        try {
            userService.addUser(detail);
            log.info("user :: add :: success");
            return "redirect:/user/list";
//            return ResponseEntity.ok("회원가입 완료");
        } catch (Exception e) {
            log.info("user :: add :: fail");
            return "redirect:add";
//            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
