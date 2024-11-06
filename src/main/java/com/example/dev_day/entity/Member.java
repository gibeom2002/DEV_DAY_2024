package com.example.dev_day.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import java.sql.Date;
@Entity
@Data           // getter and setter 구현
@Builder        // Builder 패턴 사용할 때 Builder 클래스를 구현할 필요 없게 해줌
@Table(name = "member")
public class Member
{
    // PK로 지정
    @Id
    // 자동 id 생성
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // 객체 필드와 DB 테이블 컬럼을 매핑
    @Column(name="m_id", nullable = false, unique = true)
    private String member_id;
    @Column(name="m_pw", nullable = false)
    private String member_pw;
    @Column(name="m_name", nullable = false)
    private String member_name;

    @Column(name="m_date", nullable = true)
    private Date member_date;
    @Column(name="m_income", nullable = true)
    private int member_income;
    @Column(name="m_home", nullable = true)
    private String member_home;
    @Column(name="m_category", nullable = true)
    private String member_category;
}
