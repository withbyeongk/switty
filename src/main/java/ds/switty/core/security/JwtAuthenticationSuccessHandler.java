package ds.switty.core.security;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import java.io.IOException;

public class JwtAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    private final JwtTokenProvider jwtTokenProvider;

    public JwtAuthenticationSuccessHandler(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String token = jwtTokenProvider.generateToken(userDetails);

        // 쿠키에 토큰 저장
        Cookie tokenCookie = new Cookie("Authorization", token);
        tokenCookie.setMaxAge(7 * 24 * 60 * 60); // 쿠키 만료 시간 설정 (예: 1주)
        tokenCookie.setHttpOnly(true); // 자바스크립트를 통한 쿠키 접근 차단
        tokenCookie.setSecure(true); // HTTPS 사용 시 쿠키 전송
        tokenCookie.setPath("/"); // 쿠키가 사용되는 경로 설정

        response.addCookie(tokenCookie);

        // 리다이렉션
        response.sendRedirect("/");
    }
}