package ds.switty.user.service;

import ds.switty.user.dto.UserDetail;
import ds.switty.user.entity.User;
import ds.switty.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public void addUser(UserDetail detail) {
        char state = 'N';

        //createdAt은 추후에 수정할 예정
        LocalDateTime createdAt = LocalDateTime.now();

        User user = User.builder()
                .userId(detail.getUserId())
                .userName(detail.getUserName())
                .password(passwordEncoder.encode(detail.getPassword()))
                .email(detail.getEmail())
                .phone(detail.getPhone())
                .state(state)
                .createdAt(createdAt)
                .build();
        validateDuplicateUser(user);
        userRepository.save(user);
    }

    private void validateDuplicateUser(User user) {
        userRepository.findByUserId(user.getUserId())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

}
