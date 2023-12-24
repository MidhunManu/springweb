package com.company.render;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

/**
 * AnimeHtmlController
 */

@Controller
public class AnimeHtmlController {

	@GetMapping("/anime")
	public String displyAnimeSite(Model model) {
		model.addAttribute("anime", new Anime());
		return "anime";
	}

	@PostMapping("/postAnime")
	public String postAnime(@ModelAttribute Anime anime, Model model) {
		model.addAttribute("anime", anime);
		System.out.println(anime.getAnimeName());
		System.out.println(anime.getAnimeDesc());
		return "anime";
	}

	@GetMapping("/renderAnimeFromJson")
	public String renderAnimeHtml(Model model) {
		List<Map<String, Object>> animeJsonList = fetchAnimeJson("http://localhost:8080/showAnimeJson");
		model.addAttribute("animes", animeJsonList);
		return "anime_list";
	}

	private List<Map<String, Object>> fetchAnimeJson(String url) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(url, List.class);
	}
}
