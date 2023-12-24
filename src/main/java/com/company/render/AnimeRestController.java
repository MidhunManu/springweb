package com.company.render;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * AnimeRestController
 */
@RestController
public class AnimeRestController {

	private final JdbcTemplate jdbcTemplate;
	public AnimeRestController(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@GetMapping("/showAnimeJson")
	public List<Anime> showAnimeJsonList() {
		return List.of(new Anime(0, "Naruto", "A ninja with a dream"), new Anime(1, "One Peoce", "Greatest treaseure hunt"));
	}

	

	

}
