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
    private String id;

    @Column
    private String position;

    @OneToMany(mappedBy = "UserPosition")
    private List<UserToUserPosition> userToUserPositions = new ArrayList<>();

    @Builder
    public UserPosition(String id, String position){
        this.id = id;
        this.position = position;
    }

}
