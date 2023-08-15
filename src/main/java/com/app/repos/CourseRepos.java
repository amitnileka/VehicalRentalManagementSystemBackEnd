package com.app.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Course;

public interface CourseRepos extends JpaRepository<Course, Long> {

	Optional<List<Course>> findByName(String Name);
}
