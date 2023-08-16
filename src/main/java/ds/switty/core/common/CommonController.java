package ds.switty.core.common;

import ds.switty.user.dto.UserLogin;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class CommonController {


    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String goLogin(Model model) {
        model.addAttribute("userLogin", new UserLogin());
        return "common/login";
    }

}
