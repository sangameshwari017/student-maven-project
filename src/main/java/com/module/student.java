package com.module;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {
	@Id
	@Column
	private int Student_id;
	@Column
	private String Student_name;
	@Column
	private  int age;
	@Column
	private String course;
	@Column
	private String city;
	@Column
	private String mobile;
	
	
	public student()
	{
		
	}
	
	
	public student(int student_id, String student_name, int age, String course, String city, String mobile) {
		super();
		this.Student_id = student_id;
		this.Student_name = student_name;
		this.age = age;
		this.course = course;
		this.city = city;
		this.mobile = mobile;
	}


	public int getStudent_id() {
		return Student_id;
	}


	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}


	public String getStudent_name() {
		return Student_name;
	}


	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	
	
	

}
