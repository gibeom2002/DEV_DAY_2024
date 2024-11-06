package com.example.dev_day.member_dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberFormDTO {

    private String user_id;
    private String user_pw;
    private String phone_num;
    private String user_name;
    private String user_date;
    private String user_home;
}
