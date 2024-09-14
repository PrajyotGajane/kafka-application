package com.example.kafkaconsumerdatabase.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "wiki_recent_change")
@Data
public class WikimediaData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Lob
    private String wikiEventData;
}
