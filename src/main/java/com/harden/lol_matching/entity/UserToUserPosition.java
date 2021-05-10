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
    private String id;

    @JoinColumn(name = "id")
    @ManyToOne
    private User user;

    @JoinColumn(name = "id")
    @ManyToOne
    private UserPosition userPosition;

    @Builder
    public UserToUserPosition(String id){
        this.id = id;
    }

}
