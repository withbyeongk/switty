package ds.switty.core.auth.register;

import ds.switty.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class RegisterService {

    private final UserRepository userRepository;

    //JWT 사용시 사용할 예정


}
