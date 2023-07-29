package ds.switty.user.service;


import ds.switty.user.dto.UserDetail;
import ds.switty.user.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(String userId);

    User login(String loginId, String loginPw);

    boolean addUser(UserDetail detail);

    boolean editUser(User user);


}
