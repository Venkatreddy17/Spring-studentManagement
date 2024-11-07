package com.seleniumexpress.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.seleniumexpress.sm.DAO.StudentDAO;
import com.seleniumexpress.sm.DAO.StudentDAOImpl;
import com.seleniumexpress.sm.api.Student;

//Presentation Layer

@Controller
public class StudentController {
   
	//create object
	//StudentDAO studentDAO=new StudentDAOImpl();
     // but we use @repositort so dont want to create object 
	
	//Injecting the DAO OBJECT
	@Autowired
	private StudentDAO studentDAO;
	
	@GetMapping("/showStudent")
	public String showStudentList(Model model) {
		
		// call the dao method get the data 
		List<Student> studentList=studentDAO.loadStudents();
		
		model.addAttribute("students", studentList);
		return "student-list";
	}
}
