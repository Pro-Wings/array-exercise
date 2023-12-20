package com.prowings.array;

public class Candidate {
	
	private int rollNumber;
	private String name;

	public Candidate() {
		super();
	}
	public Candidate(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Candidate [rollNumber=" + rollNumber + ", name=" + name + "]";
	}
	
}
