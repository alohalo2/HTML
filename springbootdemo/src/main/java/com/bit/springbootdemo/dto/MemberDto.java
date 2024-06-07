package com.bit.springbootdemo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MemberDto { // 데이터를 받아오기 위한 클래스 객체
    private long id;
    private String username;
    private String password;

}
