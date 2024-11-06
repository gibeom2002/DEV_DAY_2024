package com.example.dev_day.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberFormDTO {
    // 기본 정보
    private String member_id;
    private String member_pw;
    private String member_name;
    // 분석에 사용할 정보
    private Date member_date;
    private int member_income;
    private String member_home;
    private String[] member_category;
}
