//package ds.switty.user.service;
//
//import ds.switty.security.dto.MemberDetail;
//import ds.switty.security.entity.Member;
//import ds.switty.security.repository.MemberRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//@Transactional(readOnly = true)
//@RequiredArgsConstructor
//public class MemberServiceImpl implements MemberService {
//
////    @Autowired
////    private ExUserRepository userRepository;
//
//    private final MemberRepository userRepository;
//    @Transactional
//    public boolean addUser(MemberDetail detail) {
//        //userType, state는 임의로 넣음 추후에 수정할 예정
//        //userType : A: 관리자, M: 회원
//        char state = 'N';
//
//        //createdAt은 추후에 수정할 예정
//        LocalDateTime createdAt = LocalDateTime.now();
//
//        Member user = Member.builder()
//                .password(detail.getUserPw())
//                .memberName(detail.getUserNm())
//                .email(detail.getEmail())
//                .phone(detail.getPhone())
//                .state(state)
//                .createdAt(createdAt)
//                .build();
//        userRepository.save(user);
//        return true;
//    }
//
//    @Override
//    public List<Member> findAll() {
//        return null;
////        return userRepository.findAll();
//    }
//
//    @Override
//    public Optional<Member> findByName(String name) {
////        return userRepository.findByname(name);
//        return null;
//    }
//
//    @Override
//    public Member login(String loginId, String loginPw) {
//        return null;
////        return userRepository.login(loginId, loginPw);
//    }
//
//}
