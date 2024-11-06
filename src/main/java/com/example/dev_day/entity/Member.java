package com.example.dev_day.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data           // getter and setter 구현
@Builder        // DTO -> Entity 화
@AllArgsConstructor     // 모든 컬럼 생성자 생성
@NoArgsConstructor      // 기본 생성자
@Table(name = "user_info")
public class Member
{
    // PK로 지정
    @Id
    // 자동 id 생성
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 객체 필드와 DB 테이블 컬럼을 매핑
    @Column(name="u_id", nullable = false, unique = true)
    private String user_id;
    @Column(name="u_pw", nullable = false)
    private String user_pw;
    @Column(name="phone_num", nullable = false)
    private String phone_num;
    @Column(name="u_name", nullable = false)
    private String user_name;
    @Column(name="u_date", nullable = false)
    private String user_date;
    @Column(name="u_home", nullable = false)
    private String user_home;
}
