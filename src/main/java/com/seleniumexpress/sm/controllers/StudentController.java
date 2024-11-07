package com.seleniumexpress.sm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class StudentController {
   
	
	@GetMapping("/showStudent")
	public String showStudentList() {
		return "student-list";
	}
}
