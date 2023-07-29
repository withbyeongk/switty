package ds.switty.mybatis.mappers;

import ds.switty.user.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();

    User findById(String userId);

    void addUser(User user);

    User login(String loginId, String loginPw);

    void editUser(User user);
}
