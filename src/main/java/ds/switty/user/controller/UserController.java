package ds.switty.user.controller;


import ds.switty.user.domain.User;
import ds.switty.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/add")
    public String goAddForm(Model model) {
        model.addAttribute("user", new User());
        return "user/addForm";
    }

    @PostMapping("/add")
    public String addMember(User user) {

        boolean result = userService.addUser(user);

        if ( result ){
            log.info("user :: add :: success");
            return "redirect:/user/list";
        } else {
            log.info("user :: add :: fail");
            return "redirect:add";
        }
    }

}
