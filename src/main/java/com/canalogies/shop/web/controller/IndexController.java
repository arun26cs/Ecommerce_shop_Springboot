package com.canalogies.shop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

	@RequestMapping("/")
	public String start() {
		System.out.println("hello started");
		return "index";
	}
}
