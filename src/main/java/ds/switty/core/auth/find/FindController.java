package ds.switty.core.auth.find;

import ds.switty.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/authentication/find")
public class FindController {

    private final UserService userService;

    //Member 찾을때 사용할 API
//    public String findMember() {
//
//    }

    //비번 수정할떄 사용할 API
//    public String putPassword() {
//
//    }
}
