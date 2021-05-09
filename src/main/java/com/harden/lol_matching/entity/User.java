package com.harden.lol_matching.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User {

    @Id
    private String id; // 고유 값, 카카오 로그인 토큰 사용

    @Column
    private String gameId; // 게임 아이디

    @Column
    private String profileImage; // 프로필 이미지 Url

    @Column
    private String sex; // 성별

    @Column
    private int tier; // 티어

    @Column
    private int age; // 나이

    @Column
    private String introduce; // 소개글

    @Column
    private Date lastLoginTimeStamp; // 마지막 접속 시간

    @Column
    private boolean voice; // 보이스 가능 여부

    @Column
    private String fcm; // fcm 토큰

    @Column
    private int recommend; // 추천 수

}
