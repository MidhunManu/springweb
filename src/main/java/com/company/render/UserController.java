package com.company.render;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

	@GetMapping("/usersddddf")
	public String showUserHtml(Model model) {
		model.addAttribute("user", new User());
		return "user";
	}

	@PostMapping("/submit-form")
	public String poster(@ModelAttribute User user, Model model) {
		model.addAttribute("user", user);
		System.out.println(user.getUsername());
		return "user_res";
	}

}
