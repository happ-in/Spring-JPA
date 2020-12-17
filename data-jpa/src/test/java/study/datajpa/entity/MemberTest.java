package study.datajpa.entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import study.datajpa.repository.MemberRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SpringBootTest
@Transactional
public class MemberTest {

    @Autowired private MemberRepository memberRepository;

    @PersistenceContext
    EntityManager em;

//    @Test
//    public void JpaEventBaseEntity() throws InterruptedException {
//        Member member = new Member("member1");
//        memberRepository.save(member);
//
//        Thread.sleep(2000);
//        member.changeUsername("member2");
//
//        em.flush();
//        em.clear();
//
//        //when
//        Member findMember = memberRepository.findById(member.getId()).get();
//
//        //then
//        System.out.println("findMember.createdDate = " + findMember.getCreatedDate());
//        System.out.println("findMember.updatedDate = " + findMember.getUpdatedDate());
//    }

    @Test
    public void EventBaseEntity() throws InterruptedException {
        Member member = new Member("member1");
        memberRepository.save(member);

        Thread.sleep(2000);
        member.changeUsername("member2");

        em.flush();
        em.clear();

        //when
        Member findMember = memberRepository.findById(member.getId()).get();

        //then
        System.out.println("findMember.createdDate = " + findMember.getCreatedDate());
        System.out.println("findMember.updatedDate = " + findMember.getLastModifiedDate());
    }

}
