package ds.switty.user.service;

import ds.switty.user.dto.UserDetail;
import ds.switty.user.entity.User;

import java.util.Optional;

public interface UserService {

//    void login (MemberLogin memberLogin);

    void addUser(UserDetail detail);

}
