package com.javatraining;

public class Manager extends Employee {
	private String dept;

	public Manager(String dept, String name, int age, String contact) {
		super(name, age, contact);
		this.dept = dept;
	}

	public void testMan() {
		System.out.println("Testing Manager:");
	}
}
