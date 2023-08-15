package com.app.controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.pojos.Course;
import com.app.services.CourseServiceImpl;

@RestController
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired
	private CourseServiceImpl cService;
	
	@PostMapping
	public String addCourse(@RequestBody Course course) {
		
		try {
			
			
			return cService.addCourse(course);
		}
		catch(RuntimeException e) {
			System.out.println(e);
			return "course not added";
		}
		
		
	}
	
	@GetMapping
	public List<Course> getCourse(@RequestParam String name) {
		
		return cService.getCourse(name);
		
	}
	
}
