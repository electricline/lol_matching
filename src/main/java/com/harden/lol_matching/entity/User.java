package com.harden.lol_matching.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class User {

    @Id
    @Column(name = "user_id")
    private String id; // 고유 값, 카카오 로그인 토큰 사용

    @Column(name = "game_id")
    private String gameId; // 게임 아이디

    @Column(name ="profile_image")
    private String profileImage; // 프로필 이미지 Url

    @Column(name = "sex")
    private String sex; // 성별

    @Column(name = "tier")
    private int tier; // 티어

    @Column(name = "age")
    private int age; // 나이

    @Column(name = "introduce")
    private String introduce; // 소개글

    @Column(name = "last_login_timestamp")
    private Date lastLoginTimeStamp; // 마지막 접속 시간

    @Column(name = "voice")
    private boolean voice; // 보이스 가능 여부

    @Column(name = "fcm")
    private String fcm; // fcm 토큰

    @Column(name = "recommend")
    private int recommend; // 추천 수

    @OneToMany(mappedBy = "user")
    private List<UserToDesiredPosition> userToDesiredPosition = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<UserToUserPosition> userToUserPosition = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<UserToMatchingHistory> userToMatchingHistory = new ArrayList<>();

    @Builder
    public User(String id, String gameId, String profileImage, String sex, int tier, int age, String introduce, Date lastLoginTimeStamp, boolean voice, String fcm, int recommend) {
        this.id = id;
        this.gameId = gameId;
        this.profileImage = profileImage;
        this.sex = sex;
        this.tier = tier;
        this.age = age;
        this.introduce = introduce;
        this.lastLoginTimeStamp = lastLoginTimeStamp;
        this.voice = voice;
        this.fcm = fcm;
        this.recommend = recommend;
    }
}
