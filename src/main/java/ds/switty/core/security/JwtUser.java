package ds.switty.core.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class JwtUser implements UserDetails {

    private final Long id;
    private final String userId;
    private final String password;
//    private final Collection<? extends GrantedAuthority> authorities;

//    public JwtUser(Long id, String userId, String password, Collection<? extends GrantedAuthority> authorities){
//        this.id = id;
//        this.userId = userId;
//        this.password = password;
//        this.authorities = authorities;
//    }

    public JwtUser(Long id, String userId, String password){
        this.id = id;
        this.userId = userId;
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userId;
    }

    //계정이 만료되었는지 확인
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    //계정이 잠겨있는지 확인
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    //계정의 비밀번호가 잠겨있는지 확인
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
