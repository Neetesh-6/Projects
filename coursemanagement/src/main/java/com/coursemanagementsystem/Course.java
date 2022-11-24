package com.coursemanagementsystem;

import jakarta.persistence.*;

@Entity
@Table(name = "Course")
 
//POJO class
public class Course {
 
    @Id 
    @Column(name = "courseId")
    private int id;
 
    @Column(name = "courseName")
    private String courseName;
 
    @Column(name = "duration")
    private String duration;
    
    @Column(name = "StudentName")
    private String StudentName;
    
    @Column(name = "age") 
    private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	
	}
}
	    