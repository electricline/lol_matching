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
public class UserPosition {

    @Id
    @Column(name = "user_position_id")
    private String id;

    @Column(name = "position")
    private String position;

    @OneToMany(mappedBy = "userPosition")
    private List<UserToUserPosition> userToUserPositions = new ArrayList<>();

    @Builder
    public UserPosition(String id, String position){
        this.id = id;
        this.position = position;
    }

}
