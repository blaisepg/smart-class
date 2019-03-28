package com.gbp.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/instructorDetail")
public class InstructorDetailsController {

	@RequestMapping("/list")
	public String listInstructorDetails(Model theModel) {
		return "list-instructorDetails";
	}

}