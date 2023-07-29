package ds.switty.user.service;

import ds.switty.user.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(String userId);

    User login(String loginId, String loginPw);

    boolean addUser(User user);

    boolean editUser(User user);


}
