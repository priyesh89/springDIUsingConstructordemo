package com.js.service.impl;

import java.util.List;

import com.js.dao.StudentDAO;
import com.js.dto.StudentDTO;
import com.js.service.StudentService;

public class StudentServiceImpl implements StudentService{
	
	private StudentDAO studentDAO;
	

	public StudentServiceImpl(StudentDAO studentDAO) {
		super();
		this.studentDAO = studentDAO;
	}


	public List<StudentDTO> getAllStudent() {
		return studentDAO.getAllStudent();
	}

}
