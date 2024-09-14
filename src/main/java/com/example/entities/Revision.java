package org.example.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Revision{
    public int old;
    @JsonProperty("new")
    public int mynew;
}