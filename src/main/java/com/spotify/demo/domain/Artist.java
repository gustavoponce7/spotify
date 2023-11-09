package com.spotify.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Entity
@Builder
@NoArgsConstructor
public class Artist {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
