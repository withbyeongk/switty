package ds.switty.core.security;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.security.sasl.AuthenticationException;

@Slf4j
@RequestMapping("/authentication")
@Controller
@RequiredArgsConstructor
public class AuthenticationController {

    private final JwtUserDetailsService jwtUserDetailsService;
    private final JwtTokenProvider jwtTokenProvider;

    //TODO: 예외처리 미완성 
    @ExceptionHandler({AuthenticationException.class, UsernameNotFoundException.class})
    public String handleAuthenticationException(AuthenticationException e, Model model) {
        model.addAttribute("errorMessage", e.getMessage());
        return "redirect:/login";
    }

}
