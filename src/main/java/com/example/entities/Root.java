package org.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Root{
    @JsonProperty("$schema")
    public String schema;
//    public Meta meta;
    @JsonProperty("id")
    public long id;
    @JsonProperty("type")
    public String type;
    @JsonProperty("namespace")
    public int namespace;
    @JsonProperty("title")
    public String title;
    @JsonProperty("title_url")
    public String title_url;
    @JsonProperty("comment")
    public String comment;
    @JsonProperty("timestamp")
    public long timestamp;
    @JsonProperty("user")
    public String user;
    @JsonProperty("bot")
    public boolean bot;
    @JsonProperty("notify_url")
    public String notify_url;
    @JsonProperty()
    public boolean minor;
    @JsonProperty()
    public boolean patrolled;
//    public Length length;
//    public Revision revision;
    @JsonProperty("server_url")
    public String server_url;
    @JsonProperty("server_name")
    public String server_name;
    @JsonProperty("server_script_path")
    public String server_script_path;
    @JsonProperty("wiki")
    public String wiki;
    @JsonProperty("parsedcomment")
    public String parsedcomment;
}