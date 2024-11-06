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
    private String user_id;
    private String user_pw;
    private String user_name;
    // 분석에 사용할 정보
    private Date user_date;
    private int user_income;
    private String user_home;
    private ArrayList<String> user_category;
}
