package com.realcoderz.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realcoderz.model.Course;
import com.realcoderz.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository repo;
	
	
	public List<Course> showcourse()
	{
		return repo.findAll();
	}
	
	
	
	public String addcourse(List<Course> course)
	{
		repo.saveAll(course);
		return "ADD USER";
	}
	
	

	

	public String deletecourse(int id) {
		
		repo.deleteById(id);
		return "Deleted Course";
		
	}
	
	
	public String updatecourse(Course course, int id) {
		
		if(course.getId()==id) {
		Course newcourse;
		newcourse=repo.getById(id);
		newcourse.setDescription(course.getDescription());
		newcourse.setName(course.getName());
		newcourse.setPrice(course.getPrice());
		repo.save(newcourse);
		return"Update sucessfully";
		}
		else
		{
			return"Not Update";
		}
	}
	
}
