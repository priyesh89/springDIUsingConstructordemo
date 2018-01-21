package com.js.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.js.dao.StudentDAO;
import com.js.dto.StudentDTO;

public class StudentDAOImpl implements StudentDAO {

	public List<StudentDTO> getAllStudent() {
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		StudentDTO dto = new StudentDTO();
		dto.setStudent_id(1);
		dto.setFirst_name("priyesh");
		dto.setLast_name("soni");
		dto.setContact_no("666667777");
		dto.setAddress("indore");
		list.add(dto);
		return list;
	}

}
