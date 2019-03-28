package com.gbp.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/review")
public class ReviewController {

	@RequestMapping("/list")
	public String listReviews(Model theModel) {
		return "list-reviews";
	}

}
