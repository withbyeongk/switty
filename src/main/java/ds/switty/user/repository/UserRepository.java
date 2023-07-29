package ds.switty.user.repository;

import ds.switty.mybatis.mappers.UserMapper;
import ds.switty.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll(){
        return userMapper.findAll();
    }


    public User findById(String userId) {
        return userMapper.findById(userId);
    }

    public boolean addUser(User user) {
        try{
            userMapper.addUser(user);
        } catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean editUser(User user) {
        try {
            userMapper.editUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public User login(String loginId, String loginPw) {
        return userMapper.login(loginId, loginPw);
    }
}
