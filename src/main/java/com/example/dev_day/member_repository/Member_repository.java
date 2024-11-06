package com.example.dev_day.member_repository;

import com.example.dev_day.member_domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Member_repository extends JpaRepository<Member, Long> {

}
