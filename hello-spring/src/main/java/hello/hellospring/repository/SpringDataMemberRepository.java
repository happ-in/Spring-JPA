package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import hello.hellospring.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SpringDataMemberRepository extends JpaRepository<User, Long> {

    @Override
    List<User> findAll();
}
