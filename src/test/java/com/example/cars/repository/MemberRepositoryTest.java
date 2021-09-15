package com.example.cars.repository;

import com.example.cars.entities.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void testCount() {
        long result = memberRepository.count();
        assertEquals(3, result);
    }

    @Test
    public void addMember() {
        Member member = new Member("ccc", "ccc", "cc@b.dk", "BigStreet", "Copenhagen", "2300", "true", "10");
        assertEquals(0, member.getMemberId());
        memberRepository.save(member);
        assertTrue(member.getMemberId() > 0);
    }

}