package com.realcoderz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.realcoderz.model.Course;
import com.realcoderz.service.CourseService;

@CrossOrigin
@RestController
@RequestMapping("/Course")
public class CourseController {
	
	
	@Autowired
	private CourseService service;
	
	@GetMapping("/showcourse")
	public List<Course> show() {
		
		return service.showcourse();
		
	}
	
	
	@PostMapping("/addcourse")
	public String add(@RequestBody List<Course> course) {
		return service.addcourse(course);
		
	}
	
	
	@DeleteMapping("/deletecourse/{id}")
	public String delete(@PathVariable int id) {
		
		return service.deletecourse(id);
	}
	

	@PutMapping("/updatecourse/{id}")
	public String update( @RequestBody Course course , @PathVariable int id) {
		return service.updatecourse(course, id);
	}
	
	
}
