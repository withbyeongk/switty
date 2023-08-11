package ds.switty.user.repository;

import ds.switty.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>, QueryByExampleExecutor<User> {

    Optional<User> findByUserId(String userId);
}
