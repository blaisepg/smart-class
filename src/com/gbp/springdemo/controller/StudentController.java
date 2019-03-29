package com.gbp.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gbp.springdemo.dao.StudentDAO;
import com.gbp.springdemo.entity.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	// inject the Student DAO
	@Autowired
	private StudentDAO studentDAO;

	@RequestMapping("/list")
	public String listStudents(Model theModel) {

		// get the student from DAO
		List<Student> theStudents = studentDAO.getStudents();

		// add the student to the model
		theModel.addAttribute("students", theStudents);

		return "list-students";
	}

}
