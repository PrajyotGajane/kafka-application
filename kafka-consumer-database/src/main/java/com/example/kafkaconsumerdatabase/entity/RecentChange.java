package com.example.kafkaconsumerdatabase.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "recent_changes")
@Data
public class RecentChange implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "namespace")
    private Integer namespace;

    @Column(name = "title")
    private String title;

    @Column(name = "title_url")
    private String titleUrl;

    @Column(name = "comment")
    private String comment;

    @Column(name = "timestamp")
    private Instant timestamp;

    @Column(name = "user")
    private String user;

    @Column(name = "bot")
    private Boolean bot;

    @Column(name = "notify_url")
    private String notifyUrl;

    @Column(name = "minor")
    private Boolean minor;

    @Column(name = "patrolled")
    private Boolean patrolled;

    @Embedded
    private Length length;

    @Embedded
    private Revision revision;

    @Column(name = "server_url")
    private String serverUrl;

    @Column(name = "server_name")
    private String serverName;

    @Column(name = "server_script_path")
    private String serverScriptPath;

    @Column(name = "wiki")
    private String wiki;

    @Column(name = "parsedcomment")
    private String parsedComment;
}
