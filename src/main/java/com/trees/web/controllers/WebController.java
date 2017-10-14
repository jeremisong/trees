package com.trees.web.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@RequestMapping("/")
	public String main(Model model) {
		return "index";
	}
}
