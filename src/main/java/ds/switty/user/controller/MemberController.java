//package ds.switty.user.controller;
//
//
//import ds.switty.security.dto.MemberDetail;
//import ds.switty.user.service.MemberService;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Slf4j
//@Controller
//@RequestMapping("/member")
//@RequiredArgsConstructor
//public class MemberController {
//
//    private final MemberService userService;
//
//    @GetMapping("/add")
//    public String goAddForm(Model model) {
//        model.addAttribute("user",new MemberDetail());
//        return "user/addForm";
//    }
//
//    @PostMapping("/add")
//    public String addMember(MemberDetail detail) {
//
//        boolean result = userService.addUser(detail);
//
//        if ( result ){
//            log.info("user :: add :: success");
//            return "redirect:/user/list";
//        } else {
//            log.info("user :: add :: fail");
//            return "redirect:add";
//        }
//    }
//
//}
