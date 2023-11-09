package com.spotify.demo;

import com.spotify.demo.domain.Artist;
import com.spotify.demo.service.ArtistService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner initDataBase(ArtistService artistService) {
		return (args) -> {
			artistService.saveArtist(Artist.builder().name("Caifanes").build());
			artistService.saveArtist(Artist.builder().name("Shakira").build());
			artistService.saveArtist(Artist.builder().name("Andres Calamaro").build());
			artistService.saveArtist(Artist.builder().name("Queen").build());
			log.info("The sample data has been generated");
		};
	}
}
