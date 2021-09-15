package com.example.cars.repository;

import com.example.cars.entities.Member;
import org.springframework.data.repository.CrudRepository;


public interface MemberRepository extends CrudRepository<Member,Integer> {


}
