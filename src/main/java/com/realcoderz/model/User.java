package com.realcoderz.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.GeneratorType;

@Entity(name="User")
public class User {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private String phnumber;

	private int cid;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="courseid")
	private Course course;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhnumber() {
		return phnumber;
	}


	public void setPhnumber(String phnumber) {
		this.phnumber = phnumber;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public User(int id, String name, String address, String phnumber, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phnumber = phnumber;
		this.course = course;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
}
