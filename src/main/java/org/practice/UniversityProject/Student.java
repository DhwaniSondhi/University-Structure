package org.practice.UniversityProject;

import java.util.List;

public class Student {

	private long id;
	private String name;
	private University university;
	private List<Course> courses;

	public Student() {
		super();
	}

	public Student(long id, String name, University university, List<Course> courses) {
		super();
		this.id = id;
		this.name = name;
		this.university = university;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [ \n id=" + id 
				+ ", \n name=" + name
				+ ", \n university=" + university
				+ ", \n courses" + courses + "\n]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

}
