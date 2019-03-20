package com.gbp.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/instructor")
public class InstructorController {

	@RequestMapping("/list")
	public String listInstructors(Model theModel) {
		return "list-instructors";
	}

}
