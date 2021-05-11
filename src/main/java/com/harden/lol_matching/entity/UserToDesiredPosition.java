package com.harden.lol_matching.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class UserToDesiredPosition {

    @Id
    @Column(name = "user_to_desired_position_id")
    private String id;

    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;

    @JoinColumn(name = "desired_position_id")
    @ManyToOne
    private DesiredPosition desiredPosition;

    @Builder
    public UserToDesiredPosition(String id){
        this.id = id;
    }

}
