package com.example.kafkaconsumerdatabase.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Revision {
    @Column(name = "revision_old")
    private Long oldRevision;

    @Column(name = "revision_new")
    private Long newRevision;
}