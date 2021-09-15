package com.example.cars.repos;

import com.example.cars.entities.Member;
import org.springframework.data.repository.CrudRepository;


public interface MemberRepo extends CrudRepository<Member,Integer> {
}
