package com.javatraining;

public  class Employee {
	protected String name;
	protected int age;
	protected String contact;
	public final String CMP_NAME="XYZIMC";
	public Employee(String name, int age, String contact) {
		this.name = name;
		this.age = age;
		this.contact = contact;
		
	}

	public  void testEmp() {
		System.out.println("Testing Employee:");
	}
	

}

