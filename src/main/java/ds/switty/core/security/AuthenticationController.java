package ds.switty.core.security;

import ds.switty.user.dto.UserLogin;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.security.sasl.AuthenticationException;

@Slf4j
@RequestMapping("/authentication")
@Controller
@RequiredArgsConstructor
public class AuthenticationController {

    private final JwtUserDetailsService jwtUserDetailsService;
    private final JwtTokenProvider jwtTokenProvider;

    @PostMapping("/login")
    public String getLogin(UserLogin userLogin, HttpServletResponse response) {
        UserDetails userDetails = jwtUserDetailsService.loadUserByUsername(userLogin.getUserId());

        String token = jwtTokenProvider.generateToken(userDetails);

        // 토큰을 응답 헤더에 담기
        response.setHeader("Authorization", "Bearer " + token);

        return "redirect:/";
    }

    @ExceptionHandler({AuthenticationException.class, UsernameNotFoundException.class})
    public String handleAuthenticationException(AuthenticationException e, Model model) {
        model.addAttribute("errorMessage", e.getMessage());
        return "redirect:/login";
    }

}
