package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

public class Person {

    private final UUID id;
    @NotBlank
    private final String name;

    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name){
        this.name=name;
        this.id=id;
    }

    public UUID getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

}
