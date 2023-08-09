package ds.switty.security.config;

import ds.switty.security.entity.Member;
import ds.switty.security.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class MyUserDetailService implements UserDetailsService {

    private final MemberService memberService;

    @Override
    public UserDetails loadUserByUsername(String memberName) throws UsernameNotFoundException {
        Optional<Member> optionalMember = memberService.findByMemberName(memberName);
        Member member = optionalMember.orElseThrow(() -> new UsernameNotFoundException("없는 회원입니다 ㅠ"));

        return User.builder()
                .username(member.getMemberName())
                .password(member.getPassword())
//                .roles(member.)
                //TODO: role 추가 구현 필요
                .build();
    }
}
