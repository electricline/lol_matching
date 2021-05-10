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
public class DesiredPosition {

    @Id
    private String id;

    @Column
    private String postion;

    @OneToMany(mappedBy = "DesiredPosition")
    private List<UserToDesiredPosition> userToDesiredPositions = new ArrayList<>();

    @Builder
    public DesiredPosition(String id, String position){
        this.id = id;
        this.postion = position;
    }

}
