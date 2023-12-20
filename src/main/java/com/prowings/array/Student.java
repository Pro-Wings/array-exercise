package com.prowings.array;

public class Student implements Comparable<Student>{
	
	private int rollNumber;
	private String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber, String name) {
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
		return "Student [rollNumber=" + rollNumber + ", name=" + name + "]";
	}
	
	//sorting using name
	public int compareTo(Student std) {
		
		return this.name.compareTo(std.name);
		
	}

	//sorting - using roll number
//	public int compareTo(Student std) {
//		
//		if(this.getRollNumber() == std.getRollNumber())
//			return 0;
//		else if(this.getRollNumber() > std.getRollNumber())
//			return 6;
//		else
//			return -3;
//	}

	
	
	
}
