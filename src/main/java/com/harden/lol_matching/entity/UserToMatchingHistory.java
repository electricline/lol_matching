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
public class UserToMatchingHistory {

    @Id
    @Column(name = "user_to_matching_history_id")
    private String id;


    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;

    @JoinColumn(name = "matching_history_id")
    @ManyToOne
    private MatchingHistory matchingHistory;

    @Builder
    public UserToMatchingHistory(String id){
        this.id = id;
    }

}