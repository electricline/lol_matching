package com.harden.lol_matching.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserDto {

    private String id; // 고유 값, 카카오 로그인 토큰 사용

    private String gameId; // 게임 아이디

    private String profileImage; // 프로필 이미지 Url

    private String sex; // 성별

    private int tier; // 티어

    private int age; // 나이

    private String introduce; // 소개글

    private Date lastLoginTimeStamp; // 마지막 접속 시간

    private boolean voice; // 보이스 가능 여부

    private String fcm; // fcm 토큰

    private int recommend; // 추천 수

}
