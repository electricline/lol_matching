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
public class MatchingHistory {

    @Id
    @Column(name = "matching_history_id")
    private String id;

    @Column(name = "matched_id")
    private String matchedId;

    @OneToMany(mappedBy = "matchingHistory")
    private List<UserToMatchingHistory> userToMatchingHistories = new ArrayList<>();


    @Builder
    public MatchingHistory(String id, String matchedId){
        this.id = id;
        this.matchedId = matchedId;
    }

}
