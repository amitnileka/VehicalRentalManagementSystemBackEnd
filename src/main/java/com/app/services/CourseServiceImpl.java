package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Course;
import com.app.repos.CourseRepos;

@Service
@Transactional
public class CourseServiceImpl {
	
	@Autowired
	private CourseRepos cRepo;
	
	public String addCourse(Course c) {
		
	Course course =	cRepo.save(c);
	
	return "course added succesfully";
		
	}
	
	public List<Course> getCourse(String name) {
		
		return cRepo.findByName(name).orElseThrow();
	}
	
}
