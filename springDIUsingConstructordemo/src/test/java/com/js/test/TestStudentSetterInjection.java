package com.js.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.js.dto.StudentDTO;
import com.js.service.StudentService;

public class TestStudentSetterInjection {

public static void main(String[] args) {

	ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
	StudentService service = (StudentService)context.getBean("studentService" , StudentService.class);
	List<StudentDTO> list = service.getAllStudent();
	for (StudentDTO dto : list) {
		System.out.println(dto.getStudent_id());
		System.out.println(dto.getFirst_name());
		System.out.println(dto.getLast_name());
		System.out.println(dto.getContact_no());
		System.out.println(dto.getAddress());
	}
	
}	
}
