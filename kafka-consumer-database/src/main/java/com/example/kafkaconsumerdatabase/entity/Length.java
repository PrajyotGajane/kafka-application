package com.example.kafkaconsumerdatabase.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Length {
    @Column(name = "length_old")
    private Integer oldLength;

    @Column(name = "length_new")
    private Integer newLength;
}