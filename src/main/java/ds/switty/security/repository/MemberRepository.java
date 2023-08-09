package ds.switty.security.repository;

import ds.switty.security.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long>, QueryByExampleExecutor<Member> {

    Optional<Member> findByMemberName(String memberName);
}
