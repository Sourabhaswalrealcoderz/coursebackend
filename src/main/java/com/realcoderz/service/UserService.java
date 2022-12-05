package com.realcoderz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realcoderz.model.Course;
import com.realcoderz.model.User;
import com.realcoderz.repository.CourseRepository;
import com.realcoderz.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	@Autowired
	private CourseRepository crepo;
	
	
	public List<User> showuser()
	{
		return repo.findAll();
	}
	
	
	
	public User registereduser(User user) {
	Optional<Course> c = crepo.findById(user.getCid());
	Course co = c.get();
	System.out.println("hello"+co);
	user.setCourse(co);
	
	return repo.save(user);
		
		
		
	}
	
	
	public String deleteuser(int id)
	{
		repo.deleteById(id);
		return"User deleted";
	}

}
