package com.spotify.demo.service;

import com.spotify.demo.domain.Artist;
import com.spotify.demo.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {


    ArtistRepository artistRepository;
    @Autowired
    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;

    }

    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    public void saveArtist(Artist artist) {
        artistRepository.save(artist);
    }
}
