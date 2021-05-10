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
@Table(name = "user")
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

    @OneToMany(mappedBy = "User")
    private List<UserToDesiredPosition> userToDesiredPosition = new ArrayList<>();

    @OneToMany(mappedBy = "User")
    private List<UserToUserPosition> userToUserPosition = new ArrayList<>();

    @OneToMany(mappedBy = "User")
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
