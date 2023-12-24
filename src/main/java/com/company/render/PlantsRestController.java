package com.company.render;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlantsRestController {

	private final JdbcTemplate jdTemplate;	
	public PlantsRestController(JdbcTemplate jdbcTemplate) {
		this.jdTemplate = jdbcTemplate;
	}

	@GetMapping("/showPlantList")
	public List<Map<String, Object>> showPlantJsonList() {
		String sql = "select * from plant";
		return this.jdTemplate.queryForList(sql);
	}
}
