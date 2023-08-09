package ds.switty.security.service;

import ds.switty.security.entity.Member;
import ds.switty.security.dto.MemberDetail;
import ds.switty.security.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;


    @Transactional
    public Long createMember(MemberDetail detail) {
        Member member = Member.builder()
                //~~
                .build();

        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findById(member.getId())
            .ifPresent(m -> {
                throw new IllegalStateException("이미 존재하는 회원입니다.");
            });
    }

    public Optional<Member> findByMemberName(String memberName) {
        return memberRepository.findByMemberName(memberName);
    }

}
