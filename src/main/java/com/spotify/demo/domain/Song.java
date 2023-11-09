package com.spotify.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
//@Entity
public class Song {
    //Id
    //@GeneratedValue
    private Long id;
    private String name;
    private Artist artist;
    private Long duration;
}
