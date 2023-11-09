package com.spotify.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
//@Entity
public class Playlist {
    //@Id
    //@GeneratedValue
    private Long id;
    private String name;
    private List<Song> songs;
    private User user;
}
