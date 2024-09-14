package org.example.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Length{
    public int old;
    @JsonProperty("new")
    public int mynew;
}