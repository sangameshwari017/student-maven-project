package com.dao;
import com.module.student;

	
	import java.util.List;

	public interface studentDAO {
		boolean addStudent( student s);
		boolean display_allStudent(student s);

	    student getStudent(int id);//search by id
	    boolean updateCourse(int Student_id,String course);
		boolean update_mobileNo(int Student_id,String MobileNo);
		boolean delete_student(int Student_id);
		List<student> getStudent();
		

	}
