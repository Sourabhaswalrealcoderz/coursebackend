package com.realcoderz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.realcoderz.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
