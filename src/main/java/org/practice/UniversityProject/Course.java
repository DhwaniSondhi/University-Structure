package org.practice.UniversityProject;

public class Course {

	private String idName;
	private int number;
	private String name;
	private String description;

	public Course() {
		super();
	}

	public Course(String idName, int number, String name, String description) {
		super();
		this.idName = idName;
		this.number = number;
		this.name = name;
		this.description = description;
	}

	@Override
	public String toString() {
		return idName + number + " [idName=" + idName + ", number=" + number + ", name=" + name + ", description="
				+ description
				+ "]";
	}

	public String getIdName() {
		return idName;
	}

	public void setIdName(String idName) {
		this.idName = idName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
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

}
