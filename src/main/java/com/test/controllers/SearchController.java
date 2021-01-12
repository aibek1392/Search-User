package com.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.model.User;
import com.test.service.UserService;

@Controller
public class SearchController {

	@Autowired
	private UserService userService;

	@GetMapping("/search")
	public ModelAndView getUser() {
		return new ModelAndView("search");
	}

	@PostMapping("/search")
	public ModelAndView searchValid(@RequestParam("id") int id, ModelMap model) {
		User user = userService.getUserById(id);
		if (user != null) {
			model.put("user", user);
			return new ModelAndView("view").addObject("user", user);
		}
		return new ModelAndView("error");
	}

	@GetMapping("/edit")
	public ModelAndView showUser(@RequestParam("id") int id, ModelMap model) {
		User user = userService.getUserById(id);
		model.put("user", user);
		return new ModelAndView("edit").addObject("user", user);
	}
	
	@PostMapping("/edit")
	public ModelAndView saveUser(@RequestParam("id") int id, @RequestParam("name") String name, ModelMap model) {
		User user = userService.getUserById(id);
		user.setName(name);
		userService.change(user);
		model.put("model", user);
		return new ModelAndView("view").addObject("user", user);
	}
}
