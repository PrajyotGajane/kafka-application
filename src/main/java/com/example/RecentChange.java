package org.example;


import org.example.entities.Revision;

import java.io.Serializable;
import java.time.Instant;

public class RecentChange implements Serializable {

    private Long id;

    private String type;

    private Integer namespace;

    private String title;

    private String titleUrl;

    private String comment;

    private Instant timestamp;

    private String user;

    private Boolean bot;

    private String notifyUrl;

    private Boolean minor;

    private Boolean patrolled;

    private Length length;

    private Revision revision;

    private String serverUrl;

    private String serverName;

    private String serverScriptPath;

    private String wiki;

    private String parsedComment;
}
