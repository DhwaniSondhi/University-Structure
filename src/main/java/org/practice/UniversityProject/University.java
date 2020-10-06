package org.practice.UniversityProject;

public class University {

	private String name;
	private String address;
	private int rank;

	public University() {
		super();
	}

	public University(String name, String address, int rank) {
		super();
		this.name = name;
		this.address = address;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "University [name=" + name + ", address=" + address + ", rank=" + rank + "]";
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

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
}
