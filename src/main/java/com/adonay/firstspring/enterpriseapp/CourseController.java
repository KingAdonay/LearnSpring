package com.adonay.firstspring.enterpriseapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@GetMapping("/cources")
	public List<Course> getAllCourses(){
		return Arrays.asList(new Course(1,"Fundamentals of Programming", "bdu"));
	}
	

}
