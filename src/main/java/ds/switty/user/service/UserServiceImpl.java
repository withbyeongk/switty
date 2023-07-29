package ds.switty.user.service;

import ds.switty.user.dto.UserDetail;
import ds.switty.user.entity.User;
import ds.switty.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

//    @Autowired
//    private ExUserRepository userRepository;

    private final UserRepository userRepository;
    @Override
    @Transactional
    public boolean addUser(UserDetail detail) {
        //userType, state는 임의로 넣음 추후에 수정할 예정
        //userType : A: 관리자, M: 회원
        char userType = 'M';
        char state = 'N';

        //createdAt은 추후에 수정할 예정
        LocalDateTime createdAt = LocalDateTime.now();

        User user = User.builder()
                .userPw(detail.getUserPw())
                .userNm(detail.getUserNm())
                .userType(userType)
                .email(detail.getEmail())
                .phone(detail.getPhone())
                .state(state)
                .createdAt(createdAt)
                .build();
        userRepository.save(user);
        return true;
    }

    @Override
    public List<User> findAll() {
        return null;
//        return userRepository.findAll();
    }

    @Override
    public User findById(String userId) {
//        return userRepository.findById(userId);
        return null;
    }

    @Override
    public User login(String loginId, String loginPw) {
        return null;
//        return userRepository.login(loginId, loginPw);
    }

    @Override
    public boolean editUser(User user) {
        return true;
//        return userRepository.editUser(user);
    }
}
