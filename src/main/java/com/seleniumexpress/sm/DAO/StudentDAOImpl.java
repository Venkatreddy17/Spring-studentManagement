package com.seleniumexpress.sm.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.seleniumexpress.sm.api.Student;
import com.seleniumexpress.sm.rowmapper.StudentRowMapper;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Student> loadStudents() {
		// I will write some logic to get all student data 
		//from database
		
		String sql="SELECT * FROM students";
		List<Student> theListOfStudent = jdbcTemplate.query(sql, new StudentRowMapper());
		
		return theListOfStudent;
	}

	@Override
	public void saveStudent(Student student) {
		
		//write a logic to save in database
		Object[] sqlParameters={student.getName(),student.getMobile(),student.getCountry()};
		
		String sql="insert into students(name,mobile,country) values (?,?,?)";
		
		jdbcTemplate.update(sql, sqlParameters);
		System.out.println("1 record is update..");
	}

	

}
