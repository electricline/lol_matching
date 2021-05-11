package com.harden.lol_matching.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class UserToUserPosition {

    @Id
    @Column(name = "user_to_user_position_id")
    private String id;

    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;

    @JoinColumn(name = "user_position_id")
    @ManyToOne
    private UserPosition userPosition;

    @Builder
    public UserToUserPosition(String id){
        this.id = id;
    }

}
