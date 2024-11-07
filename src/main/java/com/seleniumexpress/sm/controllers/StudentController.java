package com.seleniumexpress.sm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
   
	@ResponseBody
	@RequestMapping("/showStudent")
	public String showStudentList() {
		return "student-list data!";
	}
}
