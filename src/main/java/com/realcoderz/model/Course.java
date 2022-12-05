package com.realcoderz.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;





@Entity
@Table(name="Course")
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	
	
	private String name;
	private String description;
	private String price;
	
	
	@OneToMany(mappedBy="course",cascade=CascadeType.ALL)
	 @JsonIgnore
	private List<User> user;


	public int getId() {
		return cid;
	}


	public void setId(int id) {
		this.cid = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public List<User> getUser() {
		return user;
	}


	public void setUser(List<User> user) {
		this.user = user;
	}


	public Course(int cid, String name, String description, String price, List<User> user) {
		super();
		this.cid = cid;
		this.name = name;
		this.description = description;
		this.price = price;
		this.user = user;
	}


	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		

}
