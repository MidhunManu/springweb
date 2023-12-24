package com.company.render;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class PlantController {

	@GetMapping("/plants")
	public String showPlants(Model model) {
		model.addAttribute("plant", new Plant());
		return "plants";
	}

	@PostMapping("postPlants")
	public String addPlants(@ModelAttribute Plant plant, Model model) {
		model.addAttribute("plant", plant);
		System.out.println(plant.getPlantName());
		return "plants";
	}

	@GetMapping("/plantRender")
	public String renderPlants(Model model) {
		List<Map<String, Object>> plants = fetchPlants("http://localhost:8080/showPlantList");
		model.addAttribute("plants",plants);
		System.out.println(plants);
		
		return "plant1";
	}

	private	List<Map<String, Object>> fetchPlants (String url) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(url, List.class);
	}
}
