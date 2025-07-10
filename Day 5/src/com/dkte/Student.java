package com.dkte;

  // is - a Relationship (Student is a person)
  // Student is Super Class 
  // Person is sub Class 


public class Student extends Person {
	private int roll;
	private String course;
	private int marks;

	public Student() {// Parameter Less
		System.out.println("public Student() ");
	}

	public Student(String name, int age, int roll, String course, int marks) {
		super(name, age); 
		System.out.println("\npublic Student(String name, int age, int roll, String course, int marks)\n");
		this.roll = roll;
		this.course = course;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void display( ) {
		//System.out.printf("Name : %s Age : %d\n",this.getName(),this.getAge());
		super.display();
		System.out.printf("Roll : %d \nCourse : %s \nmarks : %d\n",this.roll,this.course,this.marks);
	}


}
