package com.gbp.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/course")
public class CourseController {

	@RequestMapping("/list")
	public String listCourses(Model theModel) {
		return "list-courses";
	}

}
