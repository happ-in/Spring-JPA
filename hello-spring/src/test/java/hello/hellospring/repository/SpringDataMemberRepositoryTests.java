package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import hello.hellospring.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringDataMemberRepositoryTests {

    @Autowired
    private SpringDataMemberRepository springDataMemberRepository;

    public SpringDataMemberRepositoryTests(SpringDataMemberRepository springDataMemberRepository) {
        this.springDataMemberRepository = springDataMemberRepository;
    }

    @Test
    public User join() {
        User user = new User();
        user.setUsername("test");
        user.setPassword("test");
        user.setEmail("test@email.com");
        return springDataMemberRepository.save(user);
    }
}
