package ds.switty.core.security;

import io.jsonwebtoken.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

@Component
public class JwtTokenProvider {

    private final String secret = "204A859D448A19B79FC05FB7F76AEA09E2645C0A922952A8FA6B45418E80FB83949DE3DAF6FC6EC22687B4B8E6F924C5B5066091028033CBBEA486D849D5BEA0";
    private final long validityInMillis = 3600000; // 1 hour

    public String generateToken(UserDetails userDetails) {
        String username = userDetails.getUsername();
        Collection<? extends GrantedAuthority> roles = userDetails.getAuthorities();

        Claims claims = Jwts.claims().setSubject(username);
        claims.put("roles", roles.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()));

        Date now = new Date();
        Date validity = new Date(now.getTime() + validityInMillis);

        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(now)
                .setExpiration(validity)
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
    }

    public String resolveToken(String bearerToken) {
        if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7);
        }
        return null;
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            throw new JwtAuthenticationException("Expired or invalid JWT token");
        }
    }

    public String getSubject(String token) {
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
    }

    public static class JwtAuthenticationException extends RuntimeException {
        public JwtAuthenticationException(String message) {
            super(message);
        }
    }
}