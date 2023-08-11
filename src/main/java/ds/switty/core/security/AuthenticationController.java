package ds.switty.core.security;

import ds.switty.user.dto.UserLogin;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RequestMapping("/authentication")
@RestController
@RequiredArgsConstructor
public class AuthenticationController {

    private final JwtUserDetailsService jwtUserDetailsService;

    @PostMapping("/login")
    public String getLogin(UserLogin userLogin) {
        jwtUserDetailsService.loadUserByUsername(userLogin.getUserId());

        return "redirect:/";
    }

}
