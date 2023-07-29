package ds.switty.user.service;

import ds.switty.user.domain.User;
import ds.switty.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(String userId) {
        return userRepository.findById(userId);
    }

    @Override
    public User login(String loginId, String loginPw) {
        return userRepository.login(loginId, loginPw);
    }

    @Override
    public boolean addUser(User user) {
        return userRepository.addUser(user);
    }

    @Override
    public boolean editUser(User user) {
        return userRepository.editUser(user);
    }
}
