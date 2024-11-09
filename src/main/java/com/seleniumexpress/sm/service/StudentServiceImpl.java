package com.seleniumexpress.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seleniumexpress.sm.DAO.StudentDAO;
import com.seleniumexpress.sm.api.Student;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
	private StudentDAO studentDAO;
	
	@Override
	public List<Student> loadStudents() {
		List<Student> studentList = studentDAO.loadStudents();
		return studentList;
	}

	@Override
	public void saveStudent(Student student) {
		//write business logic 
		//company criteria
		if(student.getCountry().equals("UK")) {
			System.out.println("mail sent to"+student.getName());
		}
		
		
		studentDAO.saveStudent(student);
		
	}

	@Override
	public Student getStudent(int id) {
		
		return studentDAO.getStudent(id);
	}

	@Override
	public void updateStudent(Student student) {
		studentDAO.updateStudent(student);
	}

	@Override
	public void delateStudent(int id) {
		studentDAO.delateStudent(id);
		
	}

}
