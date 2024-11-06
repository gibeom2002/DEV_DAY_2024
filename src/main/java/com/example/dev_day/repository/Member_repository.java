package com.example.dev_day.repository;

import com.example.dev_day.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Member_repository extends JpaRepository<Member, Long> {

}
