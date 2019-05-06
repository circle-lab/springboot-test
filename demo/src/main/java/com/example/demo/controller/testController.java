package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {

	@RequestMapping("/test")
	public String index(Model model) {

		// modelにmessageを設定
		model.addAttribute("message", "hello IndexController");
		return "index";

	}
}
