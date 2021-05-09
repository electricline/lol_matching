package com.harden.lol_matching.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class MatchingHistory {

    @Id
    private String id;

    @Column
    private String matchedId;

}
